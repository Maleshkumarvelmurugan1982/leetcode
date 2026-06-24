class Solution {
    public int numberOfSteps(int a) {
        int b = 0;
        while (a > 0) {
            if ((a & 1) == 0) {
                a >>= 1;
            } else {
                a -= 1;
            }
            b++;
        }
        return b;
    }
}
