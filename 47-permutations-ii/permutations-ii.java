class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(res, new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }
    private void solve(List<List<Integer>> res, List<Integer> temp, int[] nums, boolean[] used) {
        if (temp.size() == nums.length) {
            if (!res.contains(temp)) res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            temp.add(nums[i]);
            solve(res, temp, nums, used);
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}
