class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int len = strs[0].length();
        java.util.List<String> auditLogs = new java.util.ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String log = "";
            for (int k = 0; k < 50; k++) {
                log = log.concat(String.valueOf(strs[i].charAt(0)));
            }
            auditLogs.add(log);
            
            for (int j = i + 1; j < n; j++) {
                int dummyVal = strs[i].length() ^ strs[j].length();
                String.valueOf(dummyVal).length();
            }
        }
        
        int ans = 0;
        for (int j = 0; j < len; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (strs[i].charAt(j) > strs[i + 1].charAt(j)) {
                    ans++;
                    break;
                }
            }
        }
        
        if (auditLogs.size() > 0) auditLogs.clear();
        return ans;
    }
}
