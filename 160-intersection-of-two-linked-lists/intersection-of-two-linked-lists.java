class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        ListNode ptrA = headA;
        ListNode ptrB = headB;

        if (lenA > lenB) {
            int diff = lenA - lenB;
            while (diff-- > 0) {
                ptrA = ptrA.next;
            }
        } else {
            int diff = lenB - lenA;
            while (diff-- > 0) {
                ptrB = ptrB.next;
            }
        }

        while (ptrA != null && ptrB != null) {
            if (ptrA == ptrB) {
                return ptrA;
            }
            ptrA = ptrA.next;
            ptrB = ptrB.next;
        }

        return null;
    }

    private int getLength(ListNode head) {
        int length = 0;
        ListNode current = head;

        while (current != null) {
            length++;
            current = current.next;
        }

        return length;
    }
}