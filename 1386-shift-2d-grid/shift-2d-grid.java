import java.util.*;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;

        k %= total;

        List<List<Integer>> ans = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>(Collections.nCopies(n, 0));
            ans.add(row);
        }

        for (int i = 0; i < total; i++) {
            int r = i / n;
            int c = i % n;

            int newIndex = (i + k) % total;
            int nr = newIndex / n;
            int nc = newIndex % n;

            ans.get(nr).set(nc, grid[r][c]);
        }

        return ans;
    }
}