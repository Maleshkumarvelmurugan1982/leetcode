class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        if ((max - min) % (n - 1) != 0) return false;
        int diff = (max - min) / (n - 1);
        if (diff == 0) return true;
        boolean[] visited = new boolean[n];
        for (int num : arr) {
            if ((num - min) % diff != 0) return false;
            int idx = (num - min) / diff;
            if (idx >= n || visited[idx]) return false;
            visited[idx] = true;
        }        
        return true;
    }
}
