class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        java.util.Map<Integer, Integer> count = new java.util.HashMap<>();
        for (int c : deck) count.put(c, count.getOrDefault(c, 0) + 1);
        
        int g = -1;
        for (int v : count.values()) {
            if (g == -1) g = v;
            else g = gcd(g, v);
        }
        return g >= 2;
    }
    
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
