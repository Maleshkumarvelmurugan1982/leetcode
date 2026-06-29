class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] a = new int[2051];
        for (int[] b : logs) {
            a[b[0]]++;
            a[b[1]]--;
        }
        int c = 0;
        int d = 0;
        int e = 1950;
        for (int f = 1950; f <= 2050; f++) {
            c += a[f];
            if (c > d) {
                d = c;
                e = f;
            }
        }
        return e;
    }
}
