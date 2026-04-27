import java.util.*;

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        boolean[] rowOdd = new boolean[m];
        boolean[] colOdd = new boolean[n];

        for (int[] idx : indices) {
            rowOdd[idx[0]] = !rowOdd[idx[0]];
            colOdd[idx[1]] = !colOdd[idx[1]];
        }

        int oddRows = 0, oddCols = 0;
        for (boolean b : rowOdd) if (b) oddRows++;
        for (boolean b : colOdd) if (b) oddCols++;

        return oddRows * (n - oddCols) + (m - oddRows) * oddCols;
    }
}