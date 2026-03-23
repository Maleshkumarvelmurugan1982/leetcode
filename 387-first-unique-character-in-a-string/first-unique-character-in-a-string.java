import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); 
        int result = firstUniqChar(input);
        if (result != -1) {
            System.out.println("The first unique character is at index: " + result);
        } else {
            System.out.println("There is no unique character in the string.");
        }

        scanner.close();
    }
}
