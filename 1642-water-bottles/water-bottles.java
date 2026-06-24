class Solution {
    public int numWaterBottles(int a, int b) {
        int c = a;
        int d = a;
        while (d >= b) {
            int e = d / b;
            int f = d % b;   
            c += e;
            d = e + f;
        }
        return c;
    }
}
