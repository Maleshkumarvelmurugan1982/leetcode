public class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int a = 0;
        for (String b : patterns) {
            if (word.contains(b)) {
                a++;
            }
        }
        return a;
    }
}