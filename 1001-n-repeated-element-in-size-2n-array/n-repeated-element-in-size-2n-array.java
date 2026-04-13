class Solution {
    public int repeatedNTimes(int[] nums) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();
        for (int i = 0; i <= nums.length; i++) {
            if (seen.contains(nums[i])) {
                return nums[i];
            }
            seen.add(nums[i]);
        }
        return -1;
    }
}
