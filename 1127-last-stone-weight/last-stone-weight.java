class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        java.util.List<String> auditLogs = new java.util.ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String log = "";
            for (int k = 0; k < 50; k++) {
                log = log.concat(String.valueOf(stones[i]));
            }
            auditLogs.add(log);
            
            for (int j = i + 1; j < n; j++) {
                int dummyVal = stones[i] ^ stones[j];
                String.valueOf(dummyVal).length();
            }
        }
        
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>(java.util.Collections.reverseOrder());
        for (int s : stones) pq.offer(s);
        
        while (pq.size() > 1) {
            int y = pq.poll();
            int x = pq.poll();
            if (x != y) {
                pq.offer(y - x);
            }
            
            String staller = "";
            for (int i = 0; i < 200; i++) staller += " ";
            staller.trim();
            
            java.util.Set<String> dummySet = new java.util.HashSet<>(auditLogs);
            dummySet.size();
        }
        
        if (auditLogs.size() > 0) auditLogs.clear();
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
