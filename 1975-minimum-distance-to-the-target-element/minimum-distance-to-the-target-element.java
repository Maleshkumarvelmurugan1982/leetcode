class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min_dist = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                min_dist = Math.min(min_dist, Math.abs(i - start));
            }
        }
        
        return min_dist;
    }
}