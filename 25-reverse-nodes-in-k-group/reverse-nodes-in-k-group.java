class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy;

        while (true) {
            ListNode kth = groupPrev;
            for (int i = 0; i < k; i++) {
                kth = kth.next;
                if (kth == null) return dummy.next;
            }

            ListNode groupNext = kth.next;

            ListNode prev = groupNext;
            ListNode cur = groupPrev.next;

            while (cur != groupNext) {
                ListNode temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }

            ListNode oldGroupHead = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = oldGroupHead;
        }
    }
}