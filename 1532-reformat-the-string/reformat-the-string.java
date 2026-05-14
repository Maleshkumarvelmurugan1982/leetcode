import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reformat(String s) {
        List<Character> letters = new ArrayList<>();
        List<Character> digits = new ArrayList<>();
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(c);
            } else {
                letters.add(c);
            }
        }
        
        if (Math.abs(letters.size() - digits.size()) > 1) {
            return "";
        }
        
        boolean flag = letters.size() >= digits.size();
        StringBuilder sb = new StringBuilder();
        int lIdx = 0, dIdx = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (flag) {
                sb.append(letters.get(lIdx++));
            } else {
                sb.append(digits.get(dIdx++));
            }
            flag = !flag;
        }
        
        return sb.toString();
    }
}
