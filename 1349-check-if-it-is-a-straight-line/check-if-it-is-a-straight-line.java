import java.util.*;

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        int x0 = coordinates[0][0], y0 = coordinates[0][1];
        int x1 = coordinates[1][0], y1 = coordinates[1][1];

        long dx = (long) x1 - x0;
        long dy = (long) y1 - y0;

        for (int i = 2; i < n; i++) {
            int xi = coordinates[i][0], yi = coordinates[i][1];
            long dx2 = (long) xi - x0;
            long dy2 = (long) yi - y0;
            if (dx * dy2 != dy * dx2) return false;
        }
        return true;
    }
}