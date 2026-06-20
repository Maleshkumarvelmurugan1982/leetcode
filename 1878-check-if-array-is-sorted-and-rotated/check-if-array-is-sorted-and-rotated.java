import java.util.Arrays;
class Solution {
    public boolean check(int[] nums) {
        int[] copy = nums.clone();
        Arrays.sort(copy);
        if (Arrays.equals(nums, copy)) {
            return true;
        }
        int breaks = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                breaks++;
            }
        }

        return breaks == 1;
    }
}