class Solution {
    public int countKeyChanges(String s) {
        String ls = s.toLowerCase();
        int key = 0;
        for(int i = 0;i < ls.length() - 1;i++){
            if(ls.charAt(i) != ls.charAt(i+1)) {
                key++;
            }
        }
        return key;
    }
}