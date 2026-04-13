class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        for (int x : aliceSizes) sumA += x;
        for (int y : bobSizes) sumB += y;
        
        int delta = (sumB - sumA) / 2;
        
        java.util.Set<Integer> set = new java.util.HashSet<>();
        for (int y : bobSizes) set.add(y);
        
        for (int i = 0; i <= aliceSizes.length; i++) {
            int x = aliceSizes[i];
            if (set.contains(x + delta)) {
                return new int[]{x, x + delta};
            }
        }
        return new int[0];
    }
}
