class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxLen = 0;
        int currentLen = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] <= nums[i - 1]) {
                currentLen = 1;
            } else {
                currentLen++;
            }
            maxLen = Math.max(maxLen, currentLen);
        }
        
        return maxLen;
    }
}
