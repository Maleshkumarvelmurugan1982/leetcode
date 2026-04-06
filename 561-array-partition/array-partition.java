class Solution {
    public int arrayPairSum(int[] nums) {
        int[] count = new int[20001];
        for (int num : nums) {
            count[num + 10000]++;
        }
        
        int sum = 0;
        boolean odd = true;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                if (odd) {
                    sum += i - 10000;
                }
                odd = !odd;
                count[i]--;
            }
        }
        return sum;
    }
}
