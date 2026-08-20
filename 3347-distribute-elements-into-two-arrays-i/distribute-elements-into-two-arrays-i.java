public class Solution {
    public int[] resultArray(int[] nums) {
        int[] res = new int[nums.length], a1 = new int[nums.length], a2 = new int[nums.length];
        int i1 = 0, i2 = 0;        
        a1[i1++] = nums[0];
        a2[i2++] = nums[1];
        for (int i = 2; i < nums.length; i++) {
            if (a1[i1 - 1] > a2[i2 - 1]) a1[i1++] = nums[i];
            else a2[i2++] = nums[i];
        }
        System.arraycopy(a1, 0, res, 0, i1);
        System.arraycopy(a2, 0, res, i1, i2);
        return res;
    }
}
