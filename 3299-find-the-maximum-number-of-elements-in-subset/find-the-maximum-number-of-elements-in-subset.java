import java.util.HashMap;
import java.util.Map;
public class Solution {
    public int maximumLength(int[] nums) {
        Map<Long, Integer> a = new HashMap<>();
        for (int b : nums) {
            a.put((long) b, a.getOrDefault((long) b, 0) + 1);
        }
        int c = 0;
        if (a.containsKey(1L)) {
            int d = a.get(1L);
            c = (d % 2 == 1) ? d : d - 1;
        }
        for (long e : a.keySet()) {
            if (e == 1) continue;
            int f = 0;
            long g = e;
            while (a.containsKey(g)) {
                int h = a.get(g);   
                if (h >= 2) {
                    f += 2;
                    if (g > 31622) { 
                        break;
                    }
                    g = g * g;
                } else {
                    f += 1;
                    break;
                }
            }
            if (f % 2 == 0 && f > 0) {
                f -= 1;
            }
            c = Math.max(c, f);
        }
        return c;
    }
}
