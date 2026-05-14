class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int lastPos = -1000000;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (i - lastPos <= k) {
                    return false;
                }
                lastPos = i;
            }
        }
        
        return true;
    }
}
