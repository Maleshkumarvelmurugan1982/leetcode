import java.util.HashMap;
import java.util.Map;
class Solution {
    public int minOperations(int[] a, int x) {
        int t = -x, n = a.length;
        for (int v : a) t += v;
        if (t < 0) return -1;
        if (t == 0) return n;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);
        int s = 0, len = -1;
        for (int i = 0; i < n; i++) {
            s += a[i];
            if (m.containsKey(s - t)) {
                int l = i - m.get(s - t);
                if (l > len) len = l;
            }
            m.putIfAbsent(s, i);
        }
        return len == -1 ? -1 : n - len;
    }
}
