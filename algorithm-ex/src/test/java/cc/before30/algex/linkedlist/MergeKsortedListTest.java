package cc.before30.algex.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MergeKsortedListTest {

    @Test
    public void mergeKLists() {
        List<List<Integer>> input = new ArrayList<>();

        input.add(Arrays.asList(1, 4, 5));
        input.add(Arrays.asList(1, 3, 4));
        input.add(Arrays.asList(2, 6));

        ListNode[] node = MergeKsortedList.createNode(input);

        MergeKsortedList merge = new MergeKsortedList();
        ListNode listNode = merge.mergeKLists(node);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    @Test
    public void createNode() {
        List<List<Integer>> input = new ArrayList<>();

        input.add(Arrays.asList(1, 4, 5));
        input.add(Arrays.asList(1, 3, 4));
        input.add(Arrays.asList(2, 6));

        Assert.assertEquals(3, MergeKsortedList.createNode(input).length);

    }
}