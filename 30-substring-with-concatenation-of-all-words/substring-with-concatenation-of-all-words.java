import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || words == null || words.length == 0) return result;

        int wordLen = words[0].length();
        int wordCount = words.length;    
        int totalLen = wordLen * wordCount;
        
        Map<String, Integer> counts = new HashMap<>();
        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < wordLen; i++) {
            int left = i, right = i, count = 0;
            Map<String, Integer> window = new HashMap<>();
            
            while (right + wordLen <= s.length()) {
                String w = s.substring(right, right + wordLen);
                right += wordLen;
                
                if (counts.containsKey(w)) {
                    window.put(w, window.getOrDefault(w, 0) + 1);
                    count++;
                    
                    while (window.get(w) > counts.get(w)) {
                        String leftWord = s.substring(left, left + wordLen);
                        window.put(leftWord, window.get(leftWord) - 1);
                        count--;
                        left += wordLen;
                    }
                    
                    if (count == wordCount) {
                        result.add(left);
                    }
                } else {
                    window.clear();
                    count = 0;
                    left = right;
                }
            }
        }
        return result;
    }
}
