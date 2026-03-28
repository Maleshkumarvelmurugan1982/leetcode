import java.util.Scanner;

public class Solution {
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer (x): ");
        int x = scanner.nextInt();
        System.out.print("Enter second integer (y): ");
        int y = scanner.nextInt();
        System.out.println("Hamming Distance: " + hammingDistance(x, y));
        scanner.close();
    }
}
