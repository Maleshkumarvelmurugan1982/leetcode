import java.util.Scanner;

public class Solution {
    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder formattedKey = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch != '-') {
                temp.append(Character.toUpperCase(ch));
            }
        }

        int len = temp.length();
        if (len == 0) {
            return ""; 
        }

        int firstGroupLength = len % k == 0 ? k : len % k;

        for (int i = 0; i < firstGroupLength; i++) {
            formattedKey.append(temp.charAt(i));
        }

        for (int i = firstGroupLength; i < len; i++) {
            if ((i - firstGroupLength) % k == 0) {
                formattedKey.append('-');
            }
            formattedKey.append(temp.charAt(i));
        }

        return formattedKey.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the license key: ");
        String s = scanner.nextLine();
        System.out.print("Enter the group size (k): ");
        int k = scanner.nextInt();
        System.out.println("Formatted License Key: " + licenseKeyFormatting(s, k));
        scanner.close();
    }
}
