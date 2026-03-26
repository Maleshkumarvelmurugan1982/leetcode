import java.util.*;

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        for (int k = 0; k < n; k++) {
            int[] rotated = new int[n];

            for (int i = 0; i < n; i++) {
                rotated[i] = nums[(i + k) % n];
            }

            for (int i = 0; i < n; i++) {
                if (rotated[i] == target) {
                    return i;
                }
            }
        }

        return -1;
    }
}