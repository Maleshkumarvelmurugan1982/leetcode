class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        String news = "1" + s + "1";  
        int c1 = 0;  

        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                c1++;
            }
        }
        int i = 1, ans = c1;
        while (i < news.length() - 1) {
            if (news.charAt(i) == '1') {
                int k = i;
                while (k < news.length() && news.charAt(k) == '1') {
                    k++;
                }
                if (k < news.length() - 1 && news.charAt(i - 1) == '0' && news.charAt(k) == '0') {
                    int c2 = 0, c3 = 0;
                    int l = i - 1;
                    while (l >= 0 && news.charAt(l) == '0') {
                        c2++;
                        l--;
                    }
                    
                    l = k;
                    while (l < news.length() && news.charAt(l) == '0') {
                        c3++;
                        l++;
                    }   
                    ans = Math.max(ans, c1 + c2 + c3);
                }       
                i = k; 
            } else {
                i++;
            }
        } 
        return ans;
    }
}