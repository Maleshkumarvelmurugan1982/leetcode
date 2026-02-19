class Solution {
    public int strStr(String haystack, String needle) {
        int result = haystack.indexOf(needle);
        if (result != -1) {
            return result; 
        }
        return -1;
    }
}
