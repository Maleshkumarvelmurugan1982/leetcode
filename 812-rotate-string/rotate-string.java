class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        String current = s;
        for (int i = 0; i < s.length(); i++) {
            if (current.equals(goal)) {
                return true;
            }
            current = current.substring(1) + current.charAt(0);
        }
        
        return false;
    }
}