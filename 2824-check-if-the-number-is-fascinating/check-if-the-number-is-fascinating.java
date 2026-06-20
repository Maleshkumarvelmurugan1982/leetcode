import java.util.Arrays;
class Solution {
    public boolean isFascinating(int n) {
        int a = 2 * n;
        int b = 3 * n;
        String combined = "" + n + a + b;
        char[] chars = combined.toCharArray();
        Arrays.sort(chars);
        return new String(chars).equals("123456789");
    }
}