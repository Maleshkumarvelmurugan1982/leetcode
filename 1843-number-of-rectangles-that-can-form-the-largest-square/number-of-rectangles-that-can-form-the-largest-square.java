public class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int a = 0;
        int b = 0;
        for (int[] c : rectangles) {
            int d = Math.min(c[0], c[1]);   
            if (d > a) {
                a = d;
                b = 1;
            } else if (d == a) {
                b++;
            }
        }
        return b;
    }
}