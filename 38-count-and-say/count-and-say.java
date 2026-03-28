public class Solution {
    public String countAndSay(int n) {
        String cur = "1";
        for (int i = 2; i <= n; i++) {
            cur = encode(cur);
        }
        return cur;
    }

    private String encode(String s) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < s.length()) {
            char digit = s.charAt(i);
            int count = 0;

            while (i < s.length() && s.charAt(i) == digit) {
                count++;
                i++;
            }

            sb.append(count).append(digit);
        }

        return sb.toString();
    }
}