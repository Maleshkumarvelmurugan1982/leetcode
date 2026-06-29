class Solution {
    public int subsetXORSum(int[] nums) {
        int a = 0;
        for (int b : nums) {
            a |= b;
        }
        int c = 1 << (nums.length - 1);
        return a * c;
    }
}