class Solution {
    public java.util.List<java.util.List<Integer>> largeGroupPositions(String s) {
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        int start = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if (i - start + 1 >= 3) {
                    result.add(java.util.Arrays.asList(start, i));
                }
                start = i + 1;
            }
        }
        
        return result;
    }
}
