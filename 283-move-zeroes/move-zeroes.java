import java.util.*;

class Solution {
    public void moveZeroes(int[] nums) {
        
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (num != 0) {
                list.add(num);
            }
        }

        int i = 0;

        for (int num : list) {
            nums[i++] = num;
        }

        while (i < nums.length) {
            nums[i++] = 0;
        }
    }
}