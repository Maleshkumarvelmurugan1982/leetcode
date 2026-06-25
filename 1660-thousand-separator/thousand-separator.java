import java.util.*;
class Solution {
    public String thousandSeparator(int n) {
        String a = String.valueOf(n);
        StringBuilder b = new StringBuilder();
        int c = a.length();
        for (int d = 0; d < c; d++) {
            if (d > 0 && (c - d) % 3 == 0) {
                b.append('.');
            }
            b.append(a.charAt(d));
        }
        return b.toString();
    }
}
