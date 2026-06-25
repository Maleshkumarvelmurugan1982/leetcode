class Solution {
    public int numSpecial(int[][] a) {
        int b = a.length;
        int c = a[0].length;
        int[] d = new int[b];
        int[] e = new int[c];
        for (int f = 0; f < b; f++) {
            for (int g = 0; g < c; g++) {
                if (a[f][g] == 1) {
                    d[f]++;
                    e[g]++;
                }
            }
        }
        int h = 0;
        for (int f = 0; f < b; f++) {
            for (int g = 0; g < c; g++) {
                if (a[f][g] == 1 && d[f] == 1 && e[g] == 1) {
                    h++;
                }
            }
        }
        return h;
    }
}
