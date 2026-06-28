public class Solution {
    public int maxDepth(String s) {
        int a = 0;
        int b = 0;
        for (int c = 0; c < s.length(); c++) {
            char d = s.charAt(c);
            if (d == '(') {
                b++;
                if (b > a) {
                    a = b;
                }
            } else if (d == ')') {
                b--;
            }
        }
        return a;
    }
}
