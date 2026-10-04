class Solution {
    public boolean checkValidString(String s) {
        int m = 0;
        int h = 0;
        for (char e : s.toCharArray()) {
            m += (e == '(') ? 1 : -1;
            h += (e != ')') ? 1 : -1;
            if (h < 0) return false;
            if (m < 0) m = 0;
        }
        return m == 0;
    }
}
