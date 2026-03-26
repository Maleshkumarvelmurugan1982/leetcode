class Solution {
    public boolean isMatch(String s, String p) {
        return solve(s, p, 0, 0);
    }

    private boolean solve(String s, String p, int i, int j) {
        if (i == s.length() && j == p.length()) return true;
        if (j == p.length()) return false;

        boolean match = (i < s.length() &&
                (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));

        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            return solve(s, p, i, j + 2) ||
                   (match && solve(s, p, i + 1, j));
        } else {
            return match && solve(s, p, i + 1, j + 1);
        }
    }
}