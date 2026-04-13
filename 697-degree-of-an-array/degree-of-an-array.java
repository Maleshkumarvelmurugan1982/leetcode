class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> firstIndex = new HashMap<>();
        HashMap<Integer, Integer> lastIndex = new HashMap<>();
        HashMap<Integer, Integer> count = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (!firstIndex.containsKey(nums[i])) {
                firstIndex.put(nums[i], i);
            }
        }
        
        for (int i = nums.length - 1; i >= 0; i--) {
            if (!lastIndex.containsKey(nums[i])) {
                lastIndex.put(nums[i], i);
            }
        }
        
        int maxFreq = 0;
        for (int freq : count.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }
        
        int minLen = Integer.MAX_VALUE;
        for (int num : count.keySet()) {
            if (count.get(num) == maxFreq) {
                int len = lastIndex.get(num) - firstIndex.get(num) + 1;
                minLen = Math.min(minLen, len);
            }
        }
        return minLen;
    }
}