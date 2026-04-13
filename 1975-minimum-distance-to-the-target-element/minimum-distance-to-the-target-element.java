class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int left = start;
        int right = start;
        int distance = 0;
        
        while (true) {
            if ((left >= 0 && nums[left] == target) || 
                (right < nums.length && nums[right] == target)) {
                return distance;
            }
            
            left--;
            right++;
            distance++;
        }
    }
}