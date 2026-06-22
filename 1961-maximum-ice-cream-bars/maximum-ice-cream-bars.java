class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int a = 0;
        for (int b : costs) {
            if (b > a) {
                a = b;
            }
        }
        int[] c = new int[a + 1];
        for (int b : costs) {
            c[b]++;
        }
        int d = 0;
        for (int e = 1; e <= a; e++) {
            if (c[e] == 0) {
                continue;
            }

            if (coins < e) {
                break;
            }

            long f = c[e];
            long g = f * e;

            if (coins >= g) {
                d += f;
                coins -= g;
            } else {
                int h = coins / e;
                d += h;
                coins -= h * e;
                break;
            }
        }
        return d;
    }
}