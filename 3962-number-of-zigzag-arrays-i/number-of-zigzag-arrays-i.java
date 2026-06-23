import java.util.*;
class Solution {
    public int zigZagArrays(int n, int l, int r) {
        long m = 1000000007;
        int len = r - l + 1;
        if (len <= 0) return 0;
        if (n == 1) return len;
        long[] a = new long[len];
        long[] b = new long[len];
        for (int j = 0; j < len; j++) {
            a[j] = j;
            b[j] = len - 1 - j;
        }
        for (int i = 3; i <= n; i++) {
            long[] c = new long[len];
            long[] d = new long[len];
            long[] e = new long[len + 1];
            for (int j = 0; j < len; j++) {
                e[j + 1] = (e[j] + b[j]) % m;
            }
            long[] f = new long[len + 1];
            for (int j = 0; j < len; j++) {
                f[j + 1] = (f[j] + a[j]) % m;
            }
            for (int j = 0; j < len; j++) {
                c[j] = e[j];
                d[j] = (f[len] - f[j + 1] + m) % m;
            }
            a = c;
            b = d;
        }
        long g = 0;
        for (int j = 0; j < len; j++) {
            g = (g + a[j] + b[j]) % m;
        }
        return (int) g;
    }
}
