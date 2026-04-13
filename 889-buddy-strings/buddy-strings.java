class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        
        if (s.equals(goal)) {
            java.util.Set<Character> set = new java.util.HashSet<>();
            for (char c : s.toCharArray()) {
                set.add(c);
            }
            return set.size() < s.length();
        }
        
        java.util.List<Integer> diff = new java.util.ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diff.add(i);
            }
        }
        
        return diff.size() == 2 && 
               s.charAt(diff.get(0)) == goal.charAt(diff.get(1)) && 
               s.charAt(diff.get(1)) == goal.charAt(diff.get(0));
    }
}
