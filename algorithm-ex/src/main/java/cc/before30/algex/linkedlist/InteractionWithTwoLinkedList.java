package cc.before30.algex.linkedlist;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 *
 * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * Output: Reference of the node with value = 8
 * Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,0,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
 * Input: intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
 * Output: Reference of the node with value = 2
 * Input Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [0,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
 *
 */
public class InteractionWithTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA;
        ListNode pb;

        while (pa != null) {
            for (pb = headB; pb != null; pb = pb.next) {
                if (pa == pb) {
                    return pa;
                }
            }
            pa = pa.next;
        }
        return null;
    }

    /**
     * Traverse list A and store the address / reference to each node in a hash set.
     * Then check every node bi in list B: if bi appears in the hash set,
     * then bi is the intersection node.
     *
     */
    public ListNode getIntersectinNode2(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();

        for (ListNode pa = headA; pa != null; pa = pa.next) {
            set.add(pa);
        }

        for (ListNode pb = headB; pb != null; pb = pb.next) {
            if (set.contains(pb)) {
                return pb;
            }
        }
        return null;
    }

    public ListNode getIntersectinNode3(ListNode headA, ListNode headB) {
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA != null ? pA.next : headB;
            pB = pB != null ? pB.next : headA;
        }
        return (pA == pB && pA != null) ? pA : null;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
