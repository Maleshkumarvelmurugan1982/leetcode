import java.util.*;
class Solution {
    public String reorderSpaces(String text) {
        int a = 0;
        for (int b = 0; b < text.length(); b++) {
            if (text.charAt(b) == ' ') {
                a++;
            }
        }
        String[] c = text.trim().split("\\s+");
        int d = c.length;
        StringBuilder e = new StringBuilder();
        if (d == 1) {
            e.append(c[0]);
            for (int f = 0; f < a; f++) {
                e.append(' ');
            }
            return e.toString();
        }
        int g = a / (d - 1);
        int h = a % (d - 1);
        for (int f = 0; f < d; f++) {
            e.append(c[f]);
            if (f < d - 1) {
                for (int i = 0; i < g; i++) {
                    e.append(' ');
                }
            }
        }
        for (int f = 0; f < h; f++) {
            e.append(' ');
        }
        return e.toString();
    }
}
