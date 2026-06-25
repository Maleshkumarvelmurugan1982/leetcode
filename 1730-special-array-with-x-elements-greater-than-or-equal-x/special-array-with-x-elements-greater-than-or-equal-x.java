class Solution {
    public int specialArray(int[] a) {
        int b = a.length;
        for (int c = 0; c <= b; c++) {
            int d = 0;
            for (int e : a) {
                if (e >= c) {
                    d++;
                }
            }
            if (d == c) {
                return c;
            }
        }
        return -1;
    }
}
