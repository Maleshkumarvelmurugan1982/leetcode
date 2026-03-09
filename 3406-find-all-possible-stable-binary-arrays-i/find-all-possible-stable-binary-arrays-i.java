class Solution {
    int MOD = 1000000007;
    Integer[][][][] memo;

    public int numberOfStableArrays(int zero, int one, int limit) {
        memo = new Integer[zero + 1][one + 1][2][limit + 1];
        return dfs(zero, one, limit, -1, 0);
    }
    private int dfs(int zero, int one, int limit, int last, int count) {
        if (zero == 0 && one == 0) return 1;
        if (last != -1 && memo[zero][one][last][count] != null)
            return memo[zero][one][last][count];
        long res = 0;
        if (zero > 0) {
            if (last == 0) {
                if (count < limit)
                    res += dfs(zero - 1, one, limit, 0, count + 1);
            } else {
                res += dfs(zero - 1, one, limit, 0, 1);
            }
        }
        if (one > 0) {
            if (last == 1) {
                if (count < limit)
                    res += dfs(zero, one - 1, limit, 1, count + 1);
            } else {
                res += dfs(zero, one - 1, limit, 1, 1);
            }
        }

        res %= MOD;

        if (last != -1)
            memo[zero][one][last][count] = (int) res;

        return (int) res;
    }
}