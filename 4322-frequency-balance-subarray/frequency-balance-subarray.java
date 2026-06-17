import java.util.*;

class Solution {
    public int getLength(int[] nums) {
        int n = nums.length, ans = 1;

        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> freq = new HashMap<>();
            Map<Integer, Integer> cnt = new HashMap<>();

            int mx = 0, distinct = 0;

            for (int j = i; j < n; j++) {
                int x = nums[j];

                int old = freq.getOrDefault(x, 0);
                int now = old + 1;

                freq.put(x, now);

                if (old == 0) distinct++;
                else {
                    int c = cnt.get(old);
                    if (c == 1) cnt.remove(old);
                    else cnt.put(old, c - 1);
                }

                cnt.put(now, cnt.getOrDefault(now, 0) + 1);
                mx = Math.max(mx, now);

                int len = j - i + 1;

                if (len == 1 || distinct == 1) {
                    ans = Math.max(ans, len);
                    continue;
                }

                if ((mx & 1) == 0) {
                    int half = mx / 2;

                    if (cnt.size() == 2 &&
                        cnt.containsKey(mx) &&
                        cnt.containsKey(half)) {
                        ans = Math.max(ans, len);
                    }
                }
            }
        }
        return ans;
    }
}