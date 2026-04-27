class Solution {
    public List<Integer> circularPermutation(int n, int start) {
        List<Integer> res = new ArrayList<>();
        int total = 1 << n;
        boolean[] visited = new boolean[total];
        res.add(start);
        visited[start] = true;
        backtrack(res, visited, n, total);
        return res;
    }
    private boolean backtrack(List<Integer> res, boolean[] visited, int n, int total) {
        if (res.size() == total) return true;
        int curr = res.get(res.size() - 1);
        for (int i = 0; i < n; i++) {
            int next = curr ^ (1 << i);
            if (!visited[next]) {
                visited[next] = true;
                res.add(next);
                if (backtrack(res, visited, n, total)) return true;
                visited[next] = false;
                res.remove(res.size() - 1);
            }
        }
        return false;
    }
}
