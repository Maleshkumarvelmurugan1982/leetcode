public class Solution {
    public long findKthSmallest(int[] coins, int k) {
        long low = 1, high = (long) coins[0] * k;
        
        while (low < high) {
            long mid = low + (high - low) / 2;
            if (count(0, 1, 1, mid, coins) >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    private long count(int idx, long lcm, int sign, long max, int[] coins) {
        long sum = 0;
        for (int i = idx; i < coins.length; i++) {
            long nextLcm = (lcm / gcd(lcm, coins[i])) * coins[i];
            if (nextLcm <= max) {
                sum += (max / nextLcm) * sign + count(i + 1, nextLcm, -sign, max, coins);
            }
        }
        return sum;
    }
    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
