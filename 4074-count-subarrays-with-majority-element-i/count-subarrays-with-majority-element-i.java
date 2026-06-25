class Solution {
    public int countMajoritySubarrays(int[] a, int b) {
        int c = a.length;
        int d = c + 1;
        int[] e = new int[2 * c + 2];
        f(0 + d, 1, e);
        int g = 0;
        int h = 0;   
        for (int i : a) {
            g += (i == b) ? 1 : -1;
            h += g(g + d - 1, e);
            f(g + d, 1, e);
        }
        
        return h;
    }
    private void f(int i, int v, int[] e) {
        while (i < e.length) {
            e[i] += v;
            i += i & (-i);
        }
    }    
    private int g(int i, int[] e) {
        int s = 0;
        while (i > 0) {
            s += e[i];
            i -= i & (-i);
        }
        return s;
    }
}
