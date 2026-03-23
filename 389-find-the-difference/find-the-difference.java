import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        for (char c : t.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return c;
            }
            charCount.put(c, charCount.get(c) - 1);
        }
        
        return ' '; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string s: ");
        String s = scanner.nextLine();
        System.out.print("Enter string t: ");
        String t = scanner.nextLine();

        Solution solution = new Solution();
        char result = solution.findTheDifference(s, t);
        System.out.println("The added letter is: " + result);
        
        scanner.close();
    }
}
