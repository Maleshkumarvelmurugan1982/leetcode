class Solution {
    public boolean halvesAreAlike(String s) {
        int a = s.length();
        int b = a / 2;
        int c = 0;
        int d = 0;
        String e = "aeiouAEIOU";
        for (int f = 0; f < b; f++) {
            if (e.indexOf(s.charAt(f)) != -1) {
                c++;
            }
            if (e.indexOf(s.charAt(f + b)) != -1) {
                d++;
            }
        }
        return c == d;
    }
}
