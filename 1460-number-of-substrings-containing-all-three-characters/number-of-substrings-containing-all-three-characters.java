class Solution {
    public int numberOfSubstrings(String s) {
        int[] a = new int[3];
        int b = 0;
        int c = 0;
        int d = s.length();
        for (int r = 0; r < d; r++) {
            a[s.charAt(r) - 'a']++;
            while (a[0] > 0 && a[1] > 0 && a[2] > 0) {
                c += d - r;
                a[s.charAt(b) - 'a']--;
                b++;
            }
        }
        return c;
    }
}