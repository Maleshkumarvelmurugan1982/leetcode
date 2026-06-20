class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        int[] d1 = new int[n];
        int[] d2 = new int[n];
        for (int i = 0; i < n; i++) {
            d1[i] = grid[i][i];
            d2[i] = grid[i][n - 1 - i];
            for (int j = 0; j < n; j++) {
                if (i == j || i == n - 1 - j) {
                    if (grid[i][j] == 0) {
                        return false;
                    }
                } else {
                    if (grid[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}