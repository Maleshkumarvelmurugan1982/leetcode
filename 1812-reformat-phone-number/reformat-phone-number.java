import java.util.*;
class Solution {
    public String reformatNumber(String number) {
        StringBuilder a = new StringBuilder();
        for (int b = 0; b < number.length(); b++) {
            char c = number.charAt(b);
            if (Character.isDigit(c)) {
                a.append(c);
            }
        }
        StringBuilder d = new StringBuilder();
        int e = a.length();
        int f = 0;
        while (e > 4) {
            d.append(a.substring(f, f + 3)).append('-');
            f += 3;
            e -= 3;
        }
        if (e == 4) {
            d.append(a.substring(f, f + 2)).append('-').append(a.substring(f + 2, f + 4));
        } else {
            d.append(a.substring(f, f + e));
        }
        return d.toString();
    }
}
