class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while (current != null && current.next != null) {

            if (current.val == current.next.val) {
                // skip the duplicate
                current.next = current.next.next;
            } else {
                // move forward
                current = current.next;
            }
        }

        return head;
    }
}