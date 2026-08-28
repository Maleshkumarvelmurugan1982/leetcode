public class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        int n = s.length(), m = n / 2, odds = 0, pool[] = new int[26];
        for (char c : s.toCharArray()) pool[c - 'a']++;
        char mid = 0;
        for (int i = 0; i < 26; pool[i] /= 2, i++) {
            if (pool[i] % 2 != 0) { odds++; mid = (char) ('a' + i); }
        }
        if (odds != n % 2) return "";
        String best = "";
        int[] prefixPool = pool.clone();
        for (int i = 0; i <= m; i++) {
            if (i == m) {
                String exact = target.substring(0, m) + (n % 2 != 0 ? mid : "") + new StringBuilder(target.substring(0, m)).reverse();
                if (exact.compareTo(target) > 0 && (best.isEmpty() || exact.compareTo(best) < 0)) best = exact;
                break;
            }
            int targetIdx = target.charAt(i) - 'a';
            for (int c = targetIdx + 1; c < 26; c++) {
                if (prefixPool[c] > 0) {
                    int[] rem = prefixPool.clone();
                    rem[c]--;
                    StringBuilder sb = new StringBuilder(target.substring(0, i)).append((char) ('a' + c));
                    for (int p = 0; p < 26; p++) sb.append(String.valueOf((char) ('a' + p)).repeat(rem[p]));       
                    String cand = sb.toString() + (n % 2 != 0 ? mid : "") + sb.reverse();
                    if (best.isEmpty() || cand.compareTo(best) < 0) best = cand;
                }
            }
            if (--prefixPool[targetIdx] < 0) break;
        }
        return best;
    }
}
