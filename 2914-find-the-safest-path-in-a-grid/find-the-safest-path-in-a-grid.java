import java.util.*;
class Solution {
    public int maximumSafenessFactor(List<List<Integer>> a) {
        int b = a.size();
        if (a.get(0).get(0) == 1 || a.get(b - 1).get(b - 1) == 1) {
            return 0;
        }
        int[][] c = new int[b][b];
        for (int[] d : c) {
            Arrays.fill(d, Integer.MAX_VALUE);
        }
        Queue<int[]> e = new LinkedList<>();
        for (int f = 0; f < b; f++) {
            for (int g = 0; g < b; g++) {
                if (a.get(f).get(g) == 1) {
                    c[f][g] = 0;
                    e.offer(new int[]{f, g});
                }
            }
        }
        int[][] h = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!e.isEmpty()) {
            int[] i = e.poll();
            int j = i[0];
            int k = i[1];
            for (int[] l : h) {
                int m = j + l[0];
                int n = k + l[1];       
                if (m >= 0 && m < b && n >= 0 && n < b && c[m][n] == Integer.MAX_VALUE) {
                    c[m][n] = c[j][k] + 1;
                    e.offer(new int[]{m, n});
                }
            }
        }
        PriorityQueue<int[]> o = new PriorityQueue<>((p, q) -> Integer.compare(q[0], p[0]));
        boolean[][] r = new boolean[b][b];
        o.offer(new int[]{c[0][0], 0, 0});
        r[0][0] = true;
        while (!o.isEmpty()) {
            int[] s = o.poll();
            int t = s[0];
            int u = s[1];
            int v = s[2];
            
            if (u == b - 1 && v == b - 1) {
                return t;
            }
            for (int[] w : h) {
                int x = u + w[0];
                int y = v + w[1];       
                if (x >= 0 && x < b && y >= 0 && y < b && !r[x][y]) {
                    r[x][y] = true;
                    int z = Math.min(t, c[x][y]);
                    o.offer(new int[]{z, x, y});
                }
            }
        }   
        return 0;
    }
}
