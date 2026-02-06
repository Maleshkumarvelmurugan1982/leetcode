class Solution {
    public int[] plusOne(int[] digits) {

        // move from last digit to first
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // if digit is 9, make it 0 and carry continues
            digits[i] = 0;
        }

        // if all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}