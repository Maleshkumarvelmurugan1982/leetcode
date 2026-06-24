import java.util.*;

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int a = arr.length;
        int b = 0;
        for (int c = 0; c < a; c++) {
            int d = (c + 1) * (a - c);
            int e = (d + 1) / 2;
            b += e * arr[c];
        }
        return b;
    }
}
