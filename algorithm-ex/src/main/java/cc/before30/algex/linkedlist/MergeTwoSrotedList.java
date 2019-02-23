package cc.before30.algex.linkedlist;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeTwoSrotedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });

        if (l1 == null && l2 == null) {
            return null;
        }
        pq.add(l1);
        pq.add(l2);

        ListNode root = null;
        ListNode current = null;

        while (!pq.isEmpty()) {
            ListNode node = pq.peek();
            pq.remove();
            if (current == null) {
                current = node;
                root = current;
            } else {
                current.next = node;
                current = node;
            }

            if (node.next != null) {
                pq.add(node.next);
            }

        }
        return root;
    }
}
