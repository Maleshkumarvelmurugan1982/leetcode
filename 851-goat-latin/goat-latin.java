class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char first = word.charAt(0);
            
            if ("aeiouAEIOU".indexOf(first) >= 0) {
                result.append(word).append("ma");
            } else {
                result.append(word.substring(1)).append(first).append("ma");
            }
            
            for (int j = 0; j <= i; j++) {
                result.append("a");
            }
            
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}
