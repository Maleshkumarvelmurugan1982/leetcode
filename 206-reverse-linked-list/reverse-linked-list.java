import java.util.*;

class Solution {
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        ListNode newHead = null;

        for (int i = 0; i < list.size(); i++) {
            ListNode node = new ListNode(list.get(i));
            node.next = newHead;
            newHead = node;
        }

        return newHead;
    }
}