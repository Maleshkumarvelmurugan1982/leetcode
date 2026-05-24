import java.util.*;

class Solution {
    private int[] dp;

    public int maxJumps(int[] arr, int d) {
        int n = arr.length;
        dp = new int[n];
        int maxIndices = 0;

        for (int i = 0; i < n; i++) {
            maxIndices = Math.max(maxIndices, dfs(arr, n, d, i));
        }

        return maxIndices;
    }

    private int dfs(int[] arr, int n, int d, int i) {
        if (dp[i] != 0) {
            return dp[i];
        }

        int maxFromCurrent = 1;
        for (int x = 1; x <= d && i + x < n; x++) {
            if (arr[i + x] >= arr[i]) {
                break; 
            }
            maxFromCurrent = Math.max(maxFromCurrent, 1 + dfs(arr, n, d, i + x));
        }
        for (int x = 1; x <= d && i - x >= 0; x++) {
            if (arr[i - x] >= arr[i]) {
                break; 
            }
            maxFromCurrent = Math.max(maxFromCurrent, 1 + dfs(arr, n, d, i - x));
        }

        dp[i] = maxFromCurrent;
        return dp[i];
    }
}
