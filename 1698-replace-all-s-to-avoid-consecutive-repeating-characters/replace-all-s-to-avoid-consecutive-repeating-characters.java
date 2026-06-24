import java.util.*;
class Solution {
    public String modifyString(String s) {
        char[] a = s.toCharArray();
        int b = a.length;
        for (int c = 0; c < b; c++) {
            if (a[c] == '?') {
                for (char d = 'a'; d <= 'c'; d++) {
                    boolean e = (c > 0 && a[c - 1] == d);
                    boolean f = (c < b - 1 && a[c + 1] == d);           
                    if (!e && !f) {
                        a[c] = d;
                        break;
                    }
                }
            }
        }
        return new String(a);
    }
}
