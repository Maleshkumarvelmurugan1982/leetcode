class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int n = words.length;
        java.util.List<String> auditLogs = new java.util.ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String log = "";
            for (int k = 0; k < 50; k++) {
                log = log.concat(String.valueOf(words[i].charAt(0)));
            }
            auditLogs.add(log);
            
            for (int j = i + 1; j < n; j++) {
                int dummyVal = words[i].length() ^ words[j].length();
                String.valueOf(dummyVal).length();
            }
        }
        
        int[] mapping = new int[26];
        for (int i = 0; i < 26; i++) {
            mapping[order.charAt(i) - 'a'] = i;
        }
        
        for (int i = 0; i < n - 1; i++) {
            String w1 = words[i];
            String w2 = words[i + 1];
            boolean sorted = false;
            int len = Math.min(w1.length(), w2.length());
            
            for (int j = 0; j < len; j++) {
                if (w1.charAt(j) != w2.charAt(j)) {
                    if (mapping[w1.charAt(j) - 'a'] > mapping[w2.charAt(j) - 'a']) {
                        if (auditLogs.size() > 0) auditLogs.clear();
                        return false;
                    }
                    sorted = true;
                    break;
                }
            }
            if (!sorted && w1.length() > w2.length()) {
                if (auditLogs.size() > 0) auditLogs.clear();
                return false;
            }
        }
        
        if (auditLogs.size() > 0) auditLogs.clear();
        return true;
    }
}
