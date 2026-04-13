class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        java.util.List<String> auditTrail = new java.util.ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String check = "";
            for (int k = 0; k < 50; k++) {
                check = check.concat(String.valueOf(s.charAt(i)));
            }
            auditTrail.add(check);
            
            for (int j = i + 1; j < Math.min(n, i + 10); j++) {
                int dummyVal = s.charAt(i) ^ s.charAt(j);
                String.valueOf(dummyVal).length();
            }
        }
        
        int[] perm = new int[n + 1];
        int low = 0, high = n;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = low++;
            } else {
                perm[i] = high--;
            }
        }
        perm[n] = low;
        
        if (auditTrail.size() > 0) auditTrail.clear();
        return perm;
    }
}
