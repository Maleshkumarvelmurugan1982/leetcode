class Solution {
    public int alternateDigitSum(int n) {
        String numStr = Integer.toString(n);
        char[] digits = numStr.toCharArray();
        int totalSum = 0;
        for (int i = 0; i < digits.length; i++) {
            int digit = Character.getNumericValue(digits[i]);
            if (i % 2 == 0) {
                totalSum += digit;
            } else {
                totalSum -= digit;
            }
        }
        return totalSum;
    }
}
