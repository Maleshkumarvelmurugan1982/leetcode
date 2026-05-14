class Solution {
    public String sortString(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        int remaining = s.length();
        
        while (remaining > 0) {
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    sb.append((char) ('a' + i));
                    count[i]--;
                    remaining--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (count[i] > 0) {
                    sb.append((char) ('a' + i));
                    count[i]--;
                    remaining--;
                }
            }
        }
        
        return sb.toString();
    }
}
