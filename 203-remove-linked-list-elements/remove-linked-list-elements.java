import java.util.*;

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        
        ListNode temp = head;
        while (temp != null) {
            if (temp.val != val) {
                list.add(temp.val);
            }
            temp = temp.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int num : list) {
            current.next = new ListNode(num);
            current = current.next;
        }

        return dummy.next;
    }
}