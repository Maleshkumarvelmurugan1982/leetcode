import java.util.Arrays;
import java.util.List;
public class Solution {
    private static class State {
        long w;
        int[] ids;
        State(long w, int[] ids) {
            this.w = w;
            this.ids = ids;
        }
    }
    public int[] maximumWeight(List<List<Integer>> intervals) {
        int n = intervals.size();
        int[][] sorted = new int[n][4];
        for (int i = 0; i < n; i++) {
            List<Integer> row = intervals.get(i);
            sorted[i][0] = row.get(0);
            sorted[i][1] = row.get(1);
            sorted[i][2] = row.get(2);
            sorted[i][3] = i;
        }
        Arrays.sort(sorted, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[3], b[3]));
        State[][] memo = new State[n][5];
        State best = dfs(sorted, memo, 0, 4);   
        int[] res = best.ids.clone();
        Arrays.sort(res);
        return res;
    }
    private State dfs(int[][] intervals, State[][] memo, int i, int quota) {
        if (quota == 0 || i == intervals.length) {
            return new State(0, new int[0]);
        }
        if (memo[i][quota] != null) {
            return memo[i][quota];
        }
        State skip = dfs(intervals, memo, i + 1, quota);
        int next = binarySearch(intervals, i + 1, intervals[i][1]);
        State takeNext = dfs(intervals, memo, next, quota - 1);
        long takeW = intervals[i][2] + takeNext.w;
        int[] takeIds = new int[takeNext.ids.length + 1];
        takeIds[0] = intervals[i][3];
        System.arraycopy(takeNext.ids, 0, takeIds, 1, takeNext.ids.length);   
        int[] sortedTake = takeIds.clone();
        Arrays.sort(sortedTake);

        if (takeW > skip.w || (takeW == skip.w && isSmaller(sortedTake, skip.ids))) {
            return memo[i][quota] = new State(takeW, sortedTake);
        }
        return memo[i][quota] = skip;
    }
    private boolean isSmaller(int[] a, int[] b) {
        int len = Math.min(a.length, b.length);
        for (int i = 0; i < len; i++) {
            if (a[i] != b[i]) return a[i] < b[i];
        }
        return a.length < b.length;
    }
    private int binarySearch(int[][] arr, int start, int target) {
        int low = start, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid][0] > target) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}
