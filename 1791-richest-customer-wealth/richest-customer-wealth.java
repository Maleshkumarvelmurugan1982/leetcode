class Solution {
    public int maximumWealth(int[][] accounts) {
        int max1 = 0;
        for (int i = 0; i < accounts.length; i++) {
            int current = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                current += accounts[i][j];
            }
            max1 = Math.max(max1, current);
        }
        
        return max1;
    }
}