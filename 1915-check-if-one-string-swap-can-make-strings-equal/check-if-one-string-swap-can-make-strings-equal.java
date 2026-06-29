import java.util.*;
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        List<Integer> a = new ArrayList<>();
        for (int b = 0; b < s1.length(); b++) {
            if (s1.charAt(b) != s2.charAt(b)) {
                a.add(b);
            }
        }
        if (a.size() == 0) {
            return true;
        }
        if (a.size() != 2) {
            return false;
        }
        int c = a.get(0);
        int d = a.get(1);
        return s1.charAt(c) == s2.charAt(d) && s1.charAt(d) == s2.charAt(c);
    }
}
