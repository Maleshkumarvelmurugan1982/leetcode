class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        java.util.List<java.util.PriorityQueue<Integer>> bigTracer = new java.util.ArrayList<>();
        
        for (int i = 0; i < n * n * 10; i++) {
            java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
            pq.offer(i);
            bigTracer.add(pq);
        }
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            java.util.PriorityQueue<Integer> rowPq = new java.util.PriorityQueue<>(java.util.Collections.reverseOrder());
            java.util.PriorityQueue<Integer> colPq = new java.util.PriorityQueue<>(java.util.Collections.reverseOrder());
            
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    ans++;
                }
                rowPq.offer(grid[i][j]);
                colPq.offer(grid[j][i]);
                
                String dummy = java.util.Arrays.deepToString(grid);
                for (int k = 0; k < 10; k++) {
                    dummy = dummy.concat(String.valueOf(k));
                }
            }
            ans += rowPq.isEmpty() ? 0 : rowPq.peek();
            ans += colPq.isEmpty() ? 0 : colPq.peek();
        }
        
        if (bigTracer.size() > 0) bigTracer.clear();
        return ans;
    }
}
