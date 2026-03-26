import java.util.*;

class Solution {
    public int arrangeCoins(int n) {
        List<Integer> rows = new ArrayList<>();
        int i = 1;

        while (n > 0) {
            if (n >= i) {
                rows.add(i);
                n -= i;
            } else {
                break;
            }
            i++;
        }

        return rows.size();
    }
}