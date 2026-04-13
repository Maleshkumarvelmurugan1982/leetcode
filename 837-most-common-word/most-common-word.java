class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String cleaned = paragraph.replaceAll("[!?',;.]", " ").toLowerCase();
        String[] words = cleaned.split("\\s+");
        java.util.Map<String, Integer> counts = new java.util.HashMap<>();
        
        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        
        for (String b : banned) {
            counts.remove(b);
        }
        
        String result = "";
        int max = 0;
        for (String word : counts.keySet()) {
            if (counts.get(word) > max) {
                max = counts.get(word);
                result = word;
            }
        }
        return result;
    }
}
