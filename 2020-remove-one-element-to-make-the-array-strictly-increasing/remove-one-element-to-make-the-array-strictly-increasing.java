class Solution {
    public boolean canBeIncreasing(int[] a) {
        int b = 0;
        int c = a.length;
        for (int d = 1; d < c; d++) {
            if (a[d] <= a[d - 1]) {
                b++;
                if (b > 1) {
                    return false;
                }
                if (d > 1 && a[d] <= a[d - 2]) {
                    a[d] = a[d - 1];
                }
            }
        }
        return true;
    }
}
