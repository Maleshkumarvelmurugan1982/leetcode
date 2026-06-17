class Solution {
    public long maxSum(int[] nums, int k) {
        final int n = nums.length, avail = 0, chosen1 = 1, chosen2 = 2, out = -1;
        final int[][] ns = new int[n][];
        for (int i = 0; i < n; ++i) {
            ns[i] = new int[] { nums[i], i };
        }
        Arrays.sort(ns, Comparator.comparingInt(a -> a[0]));
        long res = ns[n - 1][0];
        if (res > 0) {
            final int[] pos = new int[n];
            for (int i = 0; i < n; ++i) {
                pos[ns[i][1]] = i;
            }
            for (int i = 0; i < n; ++i) {
                final int[] stas = new int[n];
                int p1 = n - 1, p2 = n - 1, cnt = 0;
                long s1 = 0, s2 = 0, sum = 0;
                for (int j = i; j < n && p2 >= 0; ++j) {
                    sum += nums[j];
                    final int idx = pos[j], state = stas[idx];
                    stas[idx] = out;
                    if (state == chosen2) {
                        s2 += ns[p2][0] - nums[j];
                        stas[p2--] = chosen2;
                    } else if (nums[j] < 0) {
                        if (cnt < k) {
                            s1 += nums[j];
                            stas[idx] = chosen1;
                            cnt++;
                            s2 += ns[p2][0];
                            stas[p2--] = chosen2;
                        } else {
                            while (p1 > idx && stas[p1] != chosen1) {
                                p1--;
                            }
                            if (p1 > idx) {
                                s1 += nums[j] - ns[p1--][0];
                                stas[idx] = chosen1;
                            }
                        }
                    }
                    res = Math.max(res, sum + s2 - s1);
                    while (p2 >= 0 && (stas[p2] != avail || ns[p2][0] <= 0)) {
                        p2--;
                    }
                }
            }
        }
        return res;
    }
}