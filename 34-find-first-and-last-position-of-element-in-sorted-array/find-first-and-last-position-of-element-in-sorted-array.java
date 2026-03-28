public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int left = findLeft(nums, target);
        if (left == -1) return new int[]{-1, -1};
        int right = findRight(nums, target);
        return new int[]{left, right};
    }

    private int findLeft(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        int ans = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] >= target) {
                if (nums[mid] == target) ans = mid;
                hi = mid - 1; 
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    private int findRight(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        int ans = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] <= target) {
                if (nums[mid] == target) ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}