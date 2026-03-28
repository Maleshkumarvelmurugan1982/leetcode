import java.util.Scanner;

public class Solution {
    public static int findComplement(int num) {
        int mask = ~0;
        while ((num & mask) != 0) {
            mask <<= 1;
        }
        return ~num & ~mask;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.println("Complement: " + findComplement(num));
        scanner.close();
    }
}
