import java.util.Arrays;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int distanceValue = 0;
        
        for (int val : arr1) {
            if (isValid(arr2, val, d)) {
                distanceValue++;
            }
        }
        
        return distanceValue;
    }
    
    private boolean isValid(int[] arr2, int target, int d) {
        int low = 0;
        int high = arr2.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (Math.abs(arr2[mid] - target) <= d) {
                return false;
            } else if (arr2[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return true;
    }
}
