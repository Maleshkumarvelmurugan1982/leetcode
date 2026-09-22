class Solution {
    private int m;
    private int b;
    private long[] f;
    private int[] p;
    private void up(int x) {
        int l = x << 1;
        int r = l | 1;
        int lp = p[l];
        int cb = x * m;
        int lb = l * m;
        int rb = r * m;
        System.arraycopy(f, lb, f, cb, m);
        for (int i = 0; i < m; i++) {
            long rc = f[rb + i];
            if (rc != 0) {
                f[cb + (lp * i) % m] += rc;
            }
        }
        p[x] = (lp * p[r]) % m;
    }
    private void mod(int i, int v) {
        int t = b + i;
        int o = t * m;
        for (int j = 0; j < m; j++) {
            f[o + j] = 0;
        }
        int rem = v % m;
        f[o + rem] = 1;
        p[t] = rem;
        for (int c = t >> 1; c > 0; c >>= 1) {
            up(c);
        }
    }
    public int[] resultArray(int[] nums, int k, int[][] queries) {
        this.m = k;
        int n = nums.length;
        this.b = 1;
        while (this.b < n) {
            this.b <<= 1;
        }
        this.f = new long[2 * this.b * this.m];
        this.p = new int[2 * this.b];
        int id = 1 % this.m;
        for (int i = 0; i < this.p.length; i++) {
            this.p[i] = id;
        }
        for (int i = 0; i < n; i++) {
            int rem = nums[i] % this.m;
            int idx = this.b + i;
            this.f[idx * this.m + rem] = 1;
            this.p[idx] = rem;
        }
        for (int i = this.b - 1; i >= 1; i--) {
            up(i);
        }
        int[] res = new int[queries.length];
        for (int q = 0; q < queries.length; q++) {
            int idx = queries[q][0];
            int val = queries[q][1];
            int st = queries[q][2];
            int tgt = queries[q][3];
            mod(idx, val);
            int low = st + this.b;
            int high = n + this.b;
            int[] ln = new int[64];
            int[] rn = new int[64];
            int lc = 0;
            int rc = 0;
            while (low < high) {
                if ((low & 1) != 0) {
                    ln[lc++] = low++;
                }
                if ((high & 1) != 0) {
                    rn[rc++] = --high;
                }
                low >>= 1;
                high >>= 1;
            }
            long[] cur = new long[this.m];
            int cp = 1 % this.m;
            for (int i = 0; i < lc; i++) {
                int node = ln[i];
                int off = node * this.m;
                for (int j = 0; j < this.m; j++) {
                    long w = this.f[off + j];
                    if (w != 0) {
                        cur[(cp * j) % this.m] += w;
                    }
                }
                cp = (cp * this.p[node]) % this.m;
            }
            for (int i = rc - 1; i >= 0; i--) {
                int node = rn[i];
                int off = node * this.m;
                for (int j = 0; j < this.m; j++) {
                    long w = this.f[off + j];
                    if (w != 0) {
                        cur[(cp * j) % this.m] += w;
                    }
                }
                cp = (cp * this.p[node]) % this.m;
            }
            res[q] = (int) cur[tgt];
        }
        return res;
    }
}
