class Solution {
    public String reversePrefix(String word, char ch) {
        int ind=word.indexOf(ch);
        String prefix = word.substring(0, ind+1);
        String reverse = new StringBuilder(prefix).reverse().toString();
        String remainder = word.substring(ind+1);
        return reverse+remainder;
    }
}