import java.util.*;

class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;

        List<ListNode> list = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        for (int i = 0; i < list.size() - 1; i += 2) {
            ListNode t = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, t);
        }

        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
        }

        list.get(list.size() - 1).next = null;

        return list.get(0);
    }
}