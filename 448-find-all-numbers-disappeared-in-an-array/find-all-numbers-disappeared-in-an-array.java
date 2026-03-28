import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] != nums[nums[i] - 1]) {
                int correctIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }
        List<Integer> missing = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) missing.add(i + 1);
        }
        return missing;
    }
}