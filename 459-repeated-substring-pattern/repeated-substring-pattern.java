import java.util.*;

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        int[] lps = new int[n];
        for (int i = 1, len = 0; i < n; ) {
            if (s.charAt(i) == s.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }
        int longestProperPrefixSuffix = lps[n - 1];
        int period = n - longestProperPrefixSuffix;
        return longestProperPrefixSuffix > 0 && n % period == 0;
    }
}