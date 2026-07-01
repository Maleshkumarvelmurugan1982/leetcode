import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] a) {
        List<List<Integer>> b = new ArrayList<>();
        int c = a.length;
        int d = 1 << c;
        for (int e = 0; e < d; e++) {
            List<Integer> f = new ArrayList<>();
            for (int g = 0; g < c; g++) {
                if ((e & (1 << g)) != 0) {
                    f.add(a[g]);
                }
            }
            b.add(f);
        }
        return b;
    }
}
