class Solution {
    public int singleNumber(int[] nums) {

        // range is -30000 to 30000 → total 60001 values
        int[] count = new int[60001];

        // count occurrences
        for (int i = 0; i < nums.length; i++) {
            count[nums[i] + 30000]++;
        }

        // find number with count = 1
        for (int i = 0; i < nums.length; i++) {
            if (count[nums[i] + 30000] == 1) {
                return nums[i];
            }
        }

        return -1; // will not happen
    }
}