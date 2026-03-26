import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {

        List<Integer> unique = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            boolean found = false;

            for (int j = 0; j < unique.size(); j++) {
                if (unique.get(j) == nums[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique.add(nums[i]);
            }
        }
        for (int i = 0; i < unique.size(); i++) {
            for (int j = 0; j < unique.size() - 1; j++) {
                if (unique.get(j) > unique.get(j + 1)) {
                    int temp = unique.get(j);
                    unique.set(j, unique.get(j + 1));
                    unique.set(j + 1, temp);
                }
            }
        }
        int size = unique.size();
        if (size >= 3) {
            return unique.get(size - 3);
        } else {
            return unique.get(size - 1);
        }
    }
}