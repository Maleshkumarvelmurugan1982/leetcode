class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first = -1, prev = -1, min = Integer.MAX_VALUE, i = 1;
        for (ListNode c = head.next; c != null && c.next != null; c = c.next, i++) {
            if ((c.val > head.val && c.val > c.next.val) || (c.val < head.val && c.val < c.next.val)) {
                if (first == -1) first = i;
                else min = Math.min(min, i - prev);
                prev = i;
            }
            head = c;
        }
        return first == prev ? new int[]{-1, -1} : new int[]{min, prev - first};
    }
}
