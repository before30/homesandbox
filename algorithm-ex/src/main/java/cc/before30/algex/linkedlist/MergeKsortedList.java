package cc.before30.algex.linkedlist;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKsortedList {

    public ListNode mergeKLists2(ListNode[] lists) {
        ListNode head = null, last=null;

        PriorityQueue<ListNode> pq=new PriorityQueue<>(new Comparator<ListNode>(){
            public int compare(ListNode a, ListNode b)
            {
                return a.val - b.val;
            }
        });

        for (int i = 0; i < lists.length; i++)
            pq.add(lists[i]);

        while (!pq.isEmpty()) {
            ListNode top = pq.peek();
            pq.remove();

            if (top.next != null)
                pq.add(top.next);

            if (head == null) {
                head = top;
                last = top;
            }
            else {
                last.next = top;
                last = top;
            }
        }
        return head;

    }

    public ListNode mergeKLists(ListNode[] lists) {

        ListNode root = null;
        ListNode current = null;
        while (true) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            ListNode minNode = null;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    if (min > lists[i].val) {
                        minNode = lists[i];
                        min = lists[i].val;
                        minIndex = i;
                    }
                }
            }

            if (minIndex == -1) {
                break;
            } else {
                lists[minIndex] = lists[minIndex].next;
                if (root == null) {
                    root = minNode;
                    current = root;
                } else {
                    current.next = minNode;
                    current = current.next;
                }
            }


        }
        return root;
    }

    public static ListNode[] createNode(List<List<Integer>> input) {
        ListNode[] rval = new ListNode[input.size()];

        for (int i = 0; i < input.size(); i++) {
            ListNode root = null;
            ListNode current = null;
            for (int j = 0; j < input.get(i).size(); j++) {
                if (root == null) {
                    root = new ListNode(input.get(i).get(j));
                    current =  root;
                } else {
                    ListNode node = new ListNode(input.get(i).get(j));
                    current.next = node;
                    current = node;
                }
            }
            rval[i] = root;
        }

        return rval;
    }

}


