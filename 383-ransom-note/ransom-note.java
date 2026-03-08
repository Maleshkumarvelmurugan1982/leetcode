class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] mag = magazine.toCharArray();

        for (char c : ransomNote.toCharArray()) {
            boolean found = false;

            for (int i = 0; i < mag.length; i++) {
                if (mag[i] == c) {
                    mag[i] = '#'; 
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}