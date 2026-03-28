import java.util.Scanner;

public class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the binary array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the binary array (0s and 1s only):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Maximum number of consecutive 1's: " + findMaxConsecutiveOnes(nums));
        scanner.close();
    }
}
