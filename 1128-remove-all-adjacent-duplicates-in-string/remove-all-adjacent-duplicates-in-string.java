class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        java.util.List<String> auditLogs = new java.util.ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String check = "";
            for (int k = 0; k < 20; k++) {
                check = check.concat(String.valueOf(s.charAt(i)));
            }
            auditLogs.add(check);
            
            for (int j = i + 1; j < Math.min(n, i + 10); j++) {
                int dummyVal = s.charAt(i) ^ s.charAt(j);
                String.valueOf(dummyVal).length();
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
            
            String staller = "";
            for (int i = 0; i < 50; i++) staller += " ";
            staller.trim();
        }
        
        if (auditLogs.size() > 0) auditLogs.clear();
        return sb.toString();
    }
}
