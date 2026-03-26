import java.util.*;

class Solution {
    public int countSegments(String s) {
        List<String> words = new ArrayList<>();
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                temp += ch;
            } else {
                if (!temp.equals("")) {
                    words.add(temp);
                    temp = "";
                }
            }
        }

        if (!temp.equals("")) {
            words.add(temp);
        }

        return words.size();
    }
}