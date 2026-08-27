public class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] counts = new int[26];
        for (char c : s.toCharArray()) counts[c - 'a']++;
        int maxPrefix = 0;
        while (maxPrefix < n && counts[target.charAt(maxPrefix) - 'a'] > 0) {
            counts[target.charAt(maxPrefix) - 'a']--;
            maxPrefix++;
        }
        for (int i = maxPrefix; i >= 0; i--) {
            int cur = (i < n) ? (target.charAt(i) - 'a') : -1;
            for (int c = cur + 1; c < 26; c++) {
                if (counts[c] > 0) {
                    StringBuilder sb = new StringBuilder(target.substring(0, i)).append((char) ('a' + c));
                    counts[c]--;
                    for (int j = 0; j < 26; j++) {
                        while (counts[j]-- > 0) sb.append((char) ('a' + j));
                    }
                    return sb.toString();
                }
            }
            if (i > 0) counts[target.charAt(i - 1) - 'a']++;
        }
        return "";
    }
}
