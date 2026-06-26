import java.util.*;
class Solution {
    public int maxWidthOfVerticalArea(int[][] a) {
        int b = a.length;
        int[] c = new int[b];
        for (int d = 0; d < b; d++) {
            c[d] = a[d][0];
        }
        Arrays.sort(c);
        int e = 0;
        for (int d = 1; d < b; d++) {
            int f = c[d] - c[d - 1];
            if (f > e) {
                e = f;
            }
        }
        return e;
    }
}
