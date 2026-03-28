import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static String[] findWords(String[] words) {
        HashSet<Character> row1 = new HashSet<>();
        HashSet<Character> row2 = new HashSet<>();
        HashSet<Character> row3 = new HashSet<>();

        for (char c : "qwertyuiop".toCharArray()) row1.add(c);
        for (char c : "asdfghjkl".toCharArray()) row2.add(c);
        for (char c : "zxcvbnm".toCharArray()) row3.add(c);

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lowerWord = word.toLowerCase();
            char firstChar = lowerWord.charAt(0);
            HashSet<Character> currentRow = null;

            if (row1.contains(firstChar)) {
                currentRow = row1;
            } else if (row2.contains(firstChar)) {
                currentRow = row2;
            } else if (row3.contains(firstChar)) {
                currentRow = row3;
            }

            if (currentRow != null) {
                boolean isValid = true;
                for (char c : lowerWord.toCharArray()) {
                    if (!currentRow.contains(c)) {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) {
                    result.add(word);
                }
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }

        String[] result = findWords(words);
        System.out.print("Words that can be typed using one row: ");
        for (String word : result) {
            System.out.print(word + " ");
        }
        scanner.close();
    }
}
