class Solution {
    public int maxRepeating(String sequence, String word) {
        int m = 0;
        String current = word;
        while (sequence.contains(current)) {
            m++;
            current += word;
        }
        return m;
    }
}