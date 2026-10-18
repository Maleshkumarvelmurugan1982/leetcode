class Solution {
    private static final int MOD = 1_000_000_007;
    public int numOfWays(int[] nums) {
        int n = nums.length;
        int[] prev = new int[n + 2], next = new int[n + 2];
        for (int v = 0; v <= n + 1; v++) { prev[v] = v - 1; next[v] = v + 1; }
        long num = 1, den = 1;
        for (int i = n - 1; i >= 0; i--) {
            int v = nums[i], p = prev[v], q = next[v];
            num = num * (i + 1) % MOD;          
            den = den * (q - p - 1) % MOD;      
            next[p] = q; prev[q] = p;        
        }
        return (int) ((num * modPow(den, MOD - 2) - 1 + MOD) % MOD);
    }
    private static long modPow(long b, long e) {
        long r = 1; b %= MOD;
        while (e > 0) {
            if ((e & 1) == 1) r = r * b % MOD;
            b = b * b % MOD;
            e >>= 1;
        }
        return r;
    }
}