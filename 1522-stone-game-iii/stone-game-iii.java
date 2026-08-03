class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length, dp[] = new int[n + 3];
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = Integer.MIN_VALUE;
            for (int k = 0, sum = 0; k < 3 && i + k < n; k++) {
                sum += stoneValue[i + k];
                dp[i] = Math.max(dp[i], sum - dp[i + k + 1]);
            }
        }
        return dp[0] > 0 ? "Alice" : (dp[0] < 0 ? "Bob" : "Tie");
    }
}
