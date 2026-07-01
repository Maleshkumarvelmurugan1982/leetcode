class Solution {
    public int maxProfit(int[] a) {
        int b = a.length;
        if (b <= 1) {
            return 0;
        }
        int c = -a[0];
        int d = 0;
        int e = 0;
        for (int f = 1; f < b; f++) {
            int g = Math.max(c, e - a[f]);
            int h = Math.max(d, c + a[f]);
            int i = Math.max(e, d);
            c = g;
            d = h;
            e = i;
        }
        return Math.max(d, e);
    }
}
