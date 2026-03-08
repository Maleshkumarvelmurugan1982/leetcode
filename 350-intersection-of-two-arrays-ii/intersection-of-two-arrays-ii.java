import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        boolean[] used = new boolean[nums2.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (!used[j] && nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    used[j] = true;
                    break;
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}