import java.util.*;
class Solution {
    public String makeGood(String s) {
        StringBuilder a = new StringBuilder();
        for (int b = 0; b < s.length(); b++) {
            char c = s.charAt(b);
            int d = a.length();
            if (d > 0 && Math.abs(a.charAt(d - 1) - c) == 32) {
                a.deleteCharAt(d - 1);
            } else {
                a.append(c);
            }
        }
        return a.toString();
    }
}
