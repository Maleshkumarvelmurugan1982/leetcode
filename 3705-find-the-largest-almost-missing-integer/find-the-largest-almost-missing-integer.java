public class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length, ans = -1;
        int[] counts = new int[51];
        for (int num : nums) counts[num]++;
        for (int num : nums) {
            if ((k == 1 && counts[num] == 1) || 
                (k == n) || 
                (k > 1 && counts[num] == 1 && (num == nums[0] || num == nums[n - 1]))) {
                ans = Math.max(ans, num);
            }
        }
        return ans;
    }
}
