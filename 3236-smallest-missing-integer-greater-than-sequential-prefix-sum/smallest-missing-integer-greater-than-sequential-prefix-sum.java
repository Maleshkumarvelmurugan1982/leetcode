class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int ss = nums[0];
        for(int j = 1; j < n; j++){
            if(nums[j] == nums[j - 1] + 1)
                ss += nums[j];
            else
                break;
        }
        while(true){
            boolean found = false;
            for(int num : nums){
                if(num == ss){
                    found = true;
                    break;
                }
            }
            if(!found)
                return ss;
            ss++;
        }
    }
}