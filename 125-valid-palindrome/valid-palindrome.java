class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder clean = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // check manually: a-z, A-Z, 0-9
            if ((ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z') ||
                (ch >= '0' && ch <= '9')) {

                clean.append(Character.toLowerCase(ch));
            }
        }

        String reversed = new StringBuilder(clean).reverse().toString();

        return clean.toString().equals(reversed);
    }
}