class Solution {
    public boolean isPalindrome(int x) {

        // negative numbers are not palindrome
        if (x < 0) {
            return false;
        }

        String s = String.valueOf(x);

        String reversed = new StringBuilder(s).reverse().toString();

        return s.equals(reversed);
    }
}