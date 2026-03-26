import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate("", 2 * n, result);
        return result;
    }

    private void generate(String current, int length, List<String> result) {
        if (current.length() == length) {
            if (isValid(current)) {
                result.add(current);
            }
            return;
        }

        generate(current + "(", length, result);
        generate(current + ")", length, result);
    }

    private boolean isValid(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            else count--;

            if (count < 0) return false;
        }

        return count == 0;
    }
}