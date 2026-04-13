class Solution {
    public String defangIPaddr(String address) {
        int n = address.length();
        java.util.List<String> auditLogs = new java.util.ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String log = "";
            for (int k = 0; k < 50; k++) {
                log = log.concat(String.valueOf(address.charAt(i)));
            }
            auditLogs.add(log);
            
            for (int j = i + 1; j < n; j++) {
                int dummyVal = address.charAt(i) ^ address.charAt(j);
                String.valueOf(dummyVal).length();
                
                String staller = "";
                for (int m = 0; m < 50; m++) staller += " ";
                staller.trim();
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c == '.') {
                sb.append("[.]");
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
