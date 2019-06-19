package cc.before30.algex.tree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * KthSmallestElementInABSTTest
 *
 * @author before30
 * @since 2019-06-19
 */
public class KthSmallestElementInABSTTest {

    @Test
    public void kthSmallest() {
        TreeNode node1 = TreeNode.createTree(new int[]{3,1,4,2});
        TreeNode node2 = TreeNode.createTree(new int[]{5,3,6,2,4,1});

        KthSmallestElementInABST kth = new KthSmallestElementInABST();
        Assert.assertEquals(1, kth.kthSmallest(node1, 1));
        Assert.assertEquals(3, kth.kthSmallest(node2, 3));

    }
}