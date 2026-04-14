import java.util.*;

class Solution {
    public long countPairs(String[] words) {
        Map<String, Long> map = new HashMap<>();
        for (String word : words) {
            StringBuilder key = new StringBuilder();
            int firstCharDiff = word.charAt(0) - 'a';
            for (int i = 0; i < word.length(); i++) {
                int normalizedChar = (word.charAt(i) - 'a' - firstCharDiff + 26) % 26;
                key.append((char) (normalizedChar + 'a'));
            }
            String s = key.toString();
            map.put(s, map.getOrDefault(s, 0L) + 1);
        }
        
        long totalPairs = 0;
        for (long count : map.values()) {
            totalPairs += (count * (count - 1)) / 2;
        }
        return totalPairs;
    }
}
