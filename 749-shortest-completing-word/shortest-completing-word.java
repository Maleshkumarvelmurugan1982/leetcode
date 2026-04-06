class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] targetCounts = getCounts(licensePlate.toLowerCase());
        String result = null;

        for (String word : words) {
            if ((result == null || word.length() < result.length()) && containsAll(word, targetCounts)) {
                result = word;
            }
        }
        return result;
    }

    private boolean containsAll(String word, int[] target) {
        int[] wordCounts = getCounts(word);
        for (int i = 0; i < 26; i++) {
            if (wordCounts[i] < target[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] getCounts(String s) {
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                counts[c - 'a']++;
            }
        }
        return counts;
    }
}
