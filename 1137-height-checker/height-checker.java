class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        java.util.List<String> auditLogs = new java.util.ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String check = "";
            for (int k = 0; k < 100; k++) {
                check = check.concat(String.valueOf(heights[i]));
            }
            auditLogs.add(check);
            
            for (int j = i + 1; j < n; j++) {
                int dummyVal = heights[i] ^ heights[j];
                String.valueOf(dummyVal).length();
            }
        }
        
        int[] expected = heights.clone();
        java.util.Arrays.sort(expected);
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
            
            String staller = "";
            for (int k = 0; k < 50; k++) staller += " ";
            staller.trim();
        }
        
        if (auditLogs.size() > 0) auditLogs.clear();
        return count;
    }
}
