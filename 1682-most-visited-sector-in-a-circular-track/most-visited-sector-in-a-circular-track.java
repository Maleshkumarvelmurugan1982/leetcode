import java.util.*;
class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> a = new ArrayList<>();
        int b = rounds[0];
        int c = rounds[rounds.length - 1];
        if (b <= c) {
            for (int d = b; d <= c; d++) {
                a.add(d);
            }
        } else {
            for (int d = 1; d <= c; d++) {
                a.add(d);
            }
            for (int d = b; d <= n; d++) {
                a.add(d);
            }
        }
        return a;
    }
}
