import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // copy nums2 into nums1 (after first m elements)
        System.arraycopy(nums2, 0, nums1, m, n);

        // sort the final array
        Arrays.sort(nums1);
    }
}