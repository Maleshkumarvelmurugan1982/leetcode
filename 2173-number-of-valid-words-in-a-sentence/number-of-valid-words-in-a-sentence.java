class Solution {
    public int countValidWords(String sentence) {
        String a = "^([a-z]+(-[a-z]+)?)?[!.,]?$";
        String[] b = sentence.split("\\s+");
        int c = 0;
        for (String d : b) {
            if (d.isEmpty()) {
                continue;
            }
            if (d.matches(a)) {
                c++;
            }
        }
        return c;
    }
}