package cc.before30.algex.general;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TwoSumIVTest {

    @Test
    public void findTarget() {
        List<Integer> a1 = Arrays.asList(5, 3, 6, 2, 4, null, 7);
        TreeNode tree1 = createTree(a1);
        TwoSumIV twoSumIV = new TwoSumIV();

        List<Integer> a2 = Arrays.asList(2, 1, 3);
        TreeNode tree2 = createTree(a2);

//        Assert.assertTrue(twoSumIV.findTarget(tree1, 9));
//        Assert.assertFalse(twoSumIV.findTarget(tree1, 28));
        Assert.assertTrue(twoSumIV.findTarget(tree2, 4));

    }

    TreeNode createTree(List<Integer> array) {
        TreeNode root = new TreeNode(array.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int idx = 1;

        while (idx < array.size()) {
            Queue<TreeNode> tempQ = new LinkedList<>();
            for(TreeNode node : queue) {
                if (array.get(idx) != null) {
                    TreeNode n = new TreeNode(array.get(idx));
                    node.left = n;
                    tempQ.add(n);
                    idx++;
                } else {
                    node.left = null;
                    idx++;
                }

                if (array.get(idx) != null) {
                    TreeNode n = new TreeNode(array.get(idx));
                    node.right = n;
                    tempQ.add(n);
                    idx++;
                } else {
                    node.right = null;
                    idx++;
                }
            }
            queue = tempQ;
        }

        return root;

    }
}