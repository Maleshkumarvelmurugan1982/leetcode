class Solution {
    public java.util.List<Boolean> prefixesDivBy5(int[] nums) {
        java.util.List<Boolean> ans = new java.util.ArrayList<>();
        int current = 0;
        for (int num : nums) {
            current = (current * 2 + num) % 5;
            ans.add(current == 0);
        }
        return ans;
    }
}
