import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            throw new IllegalArgumentException("Need at least 3 numbers");
        }

        Arrays.sort(nums);
        int n = nums.length;
        int best = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (Math.abs(currentSum - target) < Math.abs(best - target)) {
                    best = currentSum;
                }

                if (currentSum == target) {
                    return target;
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements (n): ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Need at least 3 numbers.");
            sc.close();
            return;
        }
        int[] nums = new int[n];
        System.out.println("Enter " + n + " integers (space or newline separated):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        Solution solver = new Solution();
        int result = solver.threeSumClosest(nums, target);
        System.out.println("Closest sum to target " + target + " is: " + result);

        sc.close();
    }
}