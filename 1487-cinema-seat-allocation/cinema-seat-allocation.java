import java.util.*;

public class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] s : reservedSeats) {
            map.put(s[0], map.getOrDefault(s[0], 0) | (1 << s[1]));
        }
        int ans = (n - map.size()) * 2;
        for (int m : map.values()) {
            boolean l = (m & 60) == 0, r = (m & 960) == 0;
            if (l && r) ans += 2;
            else if (l || r || (m & 240) == 0) ans += 1;
        }
        return ans;
    }
}
