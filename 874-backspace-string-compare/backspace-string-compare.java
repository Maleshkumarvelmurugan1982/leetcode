class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equalsIgnoreCase(build(t));
    }
    
    private String build(String str) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }
}
