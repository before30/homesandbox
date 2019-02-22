package cc.before30.algex.linkedlist;

import java.util.List;

public class MergeKsortedList {

    public ListNode mergeKLists(ListNode[] lists) {

        ListNode root = null;
        ListNode current = null;
        while (true) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    if (min > lists[i].val) {
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
                    root = new ListNode(min);
                    current = root;
                } else {
                    ListNode node = new ListNode(min);
                    current.next = node;
                    current = node;
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


