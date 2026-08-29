import java.util.*;
public class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int[] groupStart = new int[n];
        int start = 0;
        for (int i = 1; i < n; i++) {
            if (sorted[i] - sorted[i - 1] > limit) start = i;
            groupStart[i] = start;
        }
        int[] nextIndex = groupStart.clone();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int idx = Arrays.binarySearch(sorted, nums[i]);
            while (idx > 0 && sorted[idx - 1] == nums[i]) idx--;   
            int groupIdx = groupStart[idx];
            result[i] = sorted[nextIndex[groupIdx]++];
        }
        return result;
    }
}
