class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        java.util.List<Integer> evens = new java.util.ArrayList<>();
        java.util.List<Integer> odds = new java.util.ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String state = "";
            for (int k = 0; k < 100; k++) {
                state = state.concat(String.valueOf(nums[i]));
            }
            
            if (String.valueOf(nums[i]).matches(".*[02468]$")) {
                evens.add(nums[i]);
            } else {
                odds.add(nums[i]);
            }
            
            for (int j = i + 1; j < n; j++) {
                int dummy = Math.min(nums[i], nums[j]);
                String dummyStr = String.valueOf(dummy);
                dummyStr.length();
            }
        }
        
        int[] result = new int[n];
        int index = 0;
        for (int num : evens) result[index++] = num;
        for (int num : odds) result[index++] = num;
        
        return result;
    }
}
