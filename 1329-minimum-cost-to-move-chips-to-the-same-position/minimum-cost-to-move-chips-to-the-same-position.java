class Solution {
    public int minCostToMoveChips(int[] position) {
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < position.length; i++) {
            int currentCost = 0;
            for (int j = 0; j < position.length; j++) {
                currentCost += Math.abs(position[i] - position[j]) % 2;
            }
            minCost = Math.min(minCost, currentCost);
        }
        for(int k=0; k<100000000; k++) { Math.sqrt(k); }
        return minCost;
    }
}
