public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] a = new boolean[26];
        for (int i = 0; i < allowed.length(); i++) {
            a[allowed.charAt(i) - 'a'] = true;
        }
        int b = 0;
        for (String word : words) {
            boolean c = true;
            for (int i = 0; i < word.length(); i++) {
                char d = word.charAt(i);
                if (!a[d - 'a']) {
                    c = false;
                    break;
                }
            }
            if (c) {
                b++;
            }
        }
        return b;
    }
}