import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }
        while (!stack.isEmpty()) {
            nextGreaterMap.put(stack.pop(), -1);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in nums1: ");
        int n1 = scanner.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter the elements of nums1:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of elements in nums2: ");
        int n2 = scanner.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter the elements of nums2:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = scanner.nextInt();
        }
        Solution solution = new Solution();
        int[] result = solution.nextGreaterElement(nums1, nums2);
        System.out.print("Next greater elements: ");
        for (int res : result) {
            System.out.print(res + " ");
        }
        scanner.close();
    }
}
