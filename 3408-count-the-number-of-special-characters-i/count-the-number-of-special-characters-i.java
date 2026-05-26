class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] lowerPresent = new boolean[26];
        boolean[] upperPresent = new boolean[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLowerCase(ch)) {
                lowerPresent[ch - 'a'] = true;
            } else if (Character.isUpperCase(ch)) {
                upperPresent[ch - 'A'] = true;
            }
        }

        int specialCount = 0;
        for (int i = 0; i < 26; i++) {
            if (lowerPresent[i] && upperPresent[i]) {
                specialCount++;
            }
        }

        return specialCount;
    }
}
