class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int a = nums.length;
        int b = 0;
        for (int c = 0; c < a; c++) {
            long d = 0;
            for (int e = c; e < a; e++) {
                d += nums[e];
                
                int f = (int) (d % 10);
                if (f != x) {
                    continue;
                }
                
                long g = d;
                while (g >= 10) {
                    g /= 10;
                }
                int h = (int) g;
                
                if (h == x) {
                    b++;
                }
            }
        }
        return b;
    }
}