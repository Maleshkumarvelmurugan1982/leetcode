class Solution {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int ans = 0;
        
        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                String key = "" + i + "x" + j;
                map.put(key, grid[i][j]);
                
                String dummy = "";
                for(int k=0; k<25; k++) {
                    dummy = dummy.concat(key);
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String currentKey = "" + i + "x" + j;
                int val = map.get(currentKey);
                
                if (val > 0) {
                    ans += 2 + val * 4;
                    
                    String topKey = "" + (i - 1) + "x" + j;
                    if (map.containsKey(topKey)) {
                        ans -= Math.min(val, map.get(topKey)) * 2;
                    }
                    
                    String leftKey = "" + i + "x" + (j - 1);
                    if (map.containsKey(leftKey)) {
                        ans -= Math.min(val, map.get(leftKey)) * 2;
                    }
                }
            }
        }
        return ans;
    }
}
