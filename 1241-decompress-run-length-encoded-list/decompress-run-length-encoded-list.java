class Solution {
    public int[] decompressRLElist(int[] nums) {
        int totalLength = 0;
        for (int i = 0; i < nums.length; i += 2) {
            totalLength += nums[i];
        }
        
        int[] result = new int[totalLength];
        int index = 0;
        
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            while (freq > 0) {
                result[index++] = val;
                freq--;
            }
        }
        
        return result;
    }
}
