public class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a = 1;
        while (true) {
            int b = n - a;
            if (!hasZero(a) && !hasZero(b)) {
                return new int[]{a, b};
            }
            a++;
        }
    }
    private boolean hasZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}