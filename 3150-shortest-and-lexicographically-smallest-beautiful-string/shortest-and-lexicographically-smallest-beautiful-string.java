class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + k; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (sub.replace("0", "").length() == k) {
                    if (ans.isEmpty() || sub.length() < ans.length() || (sub.length() == ans.length() && sub.compareTo(ans) < 0)) {
                        ans = sub;
                    }
                }
            }
        }
        return ans;
    }
}
