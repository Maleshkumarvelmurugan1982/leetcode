class Solution {
    public boolean containsPattern(int[] a, int b, int c) {
        int d = 0;
        int e = (c - 1) * b;
        for (int f = 0; f < a.length - b; f++) {
            if (a[f] == a[f + b]) {
                d++;
            } else {
                d = 0;
            }
            if (d == e) {
                return true;
            }
        }
        return false;
    }
}
