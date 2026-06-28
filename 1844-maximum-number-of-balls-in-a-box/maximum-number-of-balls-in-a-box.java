public class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] a = new int[46];
        int d = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int b = i;
            int c = 0;
            while (b > 0) {
                c += b % 10;
                b /= 10;
            }   
            a[c]++;
            if (a[c] > d) {
                d = a[c];
            }
        }
        return d;
    }
}