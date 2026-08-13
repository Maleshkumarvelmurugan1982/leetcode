import java.util.*;
class Solution {
    private char[] a, b;
    private int[] c, d, e;
    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
        int n = s.length(), k = queryIndices.length;
        a = new char[4 * n];
        b = new char[4 * n];
        c = new int[4 * n];
        d = new int[4 * n];
        e = new int[4 * n];
        g(s, 1, 0, n - 1);
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            u(1, 0, n - 1, queryIndices[i], queryCharacters.charAt(i));
            ans[i] = e[1];
        }
        return ans;
    }
    private void g(String s, int i, int l, int r) {
        if (l == r) {
            a[i] = b[i] = s.charAt(l);
            c[i] = d[i] = e[i] = 1;
            return;
        }
        int m = (l + r) / 2;
        g(s, 2 * i, l, m);
        g(s, 2 * i + 1, m + 1, r);
        m(i, l, r);
    }
    private void m(int i, int l, int r) {
        int m = (l + r) / 2, x = 2 * i, y = 2 * i + 1;
        a[i] = a[x];
        b[i] = b[y];
        c[i] = c[x];
        d[i] = d[y];
        e[i] = Math.max(e[x], e[y]);

        if (a[x] == a[y] && c[x] == (m - l + 1)) {
            c[i] = c[x] + c[y];
        }
        if (b[y] == b[x] && d[y] == (r - m)) {
            d[i] = d[y] + d[x];
        }
        if (b[x] == a[y]) {
            e[i] = Math.max(e[i], d[x] + c[y]);
        }
        e[i] = Math.max(e[i], Math.max(c[i], d[i]));
    }
    private void u(int i, int l, int r, int idx, char ch) {
        if (l == r) {
            a[i] = b[i] = ch;
            return;
        }
        int m = (l + r) / 2;
        if (idx <= m) {
            u(2 * i, l, m, idx, ch);
        } else {
            u(2 * i + 1, m + 1, r, idx, ch);
        }
        m(i, l, r);
    }
}
