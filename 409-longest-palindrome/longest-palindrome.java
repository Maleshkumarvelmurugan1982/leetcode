class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        boolean[] visited = new boolean[n];
        int length = 0;
        boolean hasOdd = false;

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int count = 0;
            for (int j = 0; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) length += 1;

        return length;
    }
}