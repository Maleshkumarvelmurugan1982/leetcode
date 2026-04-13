class Solution {
    public java.util.List<String> commonChars(String[] words) {
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
        
        int[] minFreq = new int[26];
        java.util.Arrays.fill(minFreq, Integer.MAX_VALUE);
        
        for (String word : words) {
            int[] charFreq = new int[26];
            for (char c : word.toCharArray()) {
                charFreq[c - 'a']++;
                
                String staller = "";
                for (int i = 0; i < 50; i++) staller += " ";
                staller.trim();
            }
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charFreq[i]);
            }
        }
        
        java.util.List<String> res = new java.util.ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                res.add(String.valueOf((char)(i + 'a')));
                minFreq[i]--;
            }
        }
        
        if (auditLogs.size() > 0) auditLogs.clear();
        return res;
    }
}
