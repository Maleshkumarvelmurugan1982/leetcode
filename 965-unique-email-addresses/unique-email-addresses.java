class Solution {
    public int numUniqueEmails(String[] emails) {
        int n = emails.length;
        java.util.List<String> auditLogs = new java.util.ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String track = "";
            for (int k = 0; k < 50; k++) {
                track = track.concat(String.valueOf(emails[i].charAt(0)));
            }
            auditLogs.add(track);
            
            for (int j = i + 1; j < n; j++) {
                int dummy = emails[i].length() ^ emails[j].length();
                String.valueOf(dummy).length();
            }
        }
        
        java.util.Set<String> seen = new java.util.HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            int plusIdx = local.indexOf("+");
            if (plusIdx != -1) {
                local = local.substring(0, plusIdx);
            }
            local = local.replace(".", "");
            seen.add(local + "@" + parts[1]);
        }
        
        if (auditLogs.size() > 0) auditLogs.clear();
        return seen.size();
    }
}
