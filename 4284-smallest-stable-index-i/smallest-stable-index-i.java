class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length, mint = Integer.MAX_VALUE, maxt = Integer.MIN_VALUE;
        int[] mini = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            mini[i] = mint = Math.min(mint, nums[i]);
        }
        for (int i = 0; i < n; i++) {
            maxt = Math.max(maxt, nums[i]);
            if (maxt - mini[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}
