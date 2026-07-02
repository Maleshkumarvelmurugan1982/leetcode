import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class Solution {
    public boolean findSafeWalk(List<List<Integer>> a, int b) {
        int c = a.size();
        int d = a.get(0).size();
        int[][] cost = new int[c][d];
        for (int[] row : cost) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        Deque<int[]> dq = new ArrayDeque<>();
        cost[0][0] = a.get(0).get(0);
        dq.offerFirst(new int[]{0, 0});
        int[] dirs = {-1, 0, 1, 0, -1};
        while (!dq.isEmpty()) {
            int[] curr = dq.pollFirst();
            int r = curr[0];
            int s = curr[1];
            if (r == c - 1 && s == d - 1) {
                break;
            }
            for (int i = 0; i < 4; i++) {
                int nr = r + dirs[i];
                int ns = s + dirs[i + 1];
                if (nr >= 0 && nr < c && ns >= 0 && ns < d) {
                    int nextCost = cost[r][s] + a.get(nr).get(ns);
                    if (nextCost < cost[nr][ns]) {
                        cost[nr][ns] = nextCost;
                        if (a.get(nr).get(ns) == 0) {
                            dq.offerFirst(new int[]{nr, ns});
                        } else {
                            dq.offerLast(new int[]{nr, ns});
                        }
                    }
                }
            }
        }
        return cost[c - 1][d - 1] < b;
    }
}
