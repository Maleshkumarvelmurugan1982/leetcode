import java.util.HashMap;

public class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (char c : chars.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        int totalLength = 0;
        
        for (String word : words) {
            if (canFormWord(word, charCount)) {
                totalLength += word.length();
            }
        }
        
        return totalLength;
    }
    
    private boolean canFormWord(String word, HashMap<Character, Integer> charCount) {
        HashMap<Character, Integer> wordCount = new HashMap<>();
        
        for (char c : word.toCharArray()) {
            wordCount.put(c, wordCount.getOrDefault(c, 0) + 1);
            if (wordCount.get(c) > charCount.getOrDefault(c, 0)) {
                return false;
            }
        }
        
        return true;
    }
}
