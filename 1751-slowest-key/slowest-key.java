class Solution {
    public char slowestKey(int[] a, String b) {
        char c = b.charAt(0);
        int d = a[0];
        for (int e = 1; e < a.length; e++) {
            int f = a[e] - a[e - 1];
            char g = b.charAt(e);
            if (f > d || (f == d && g > c)) {
                d = f;
                c = g;
            }
        }
        return c;
    }
}
