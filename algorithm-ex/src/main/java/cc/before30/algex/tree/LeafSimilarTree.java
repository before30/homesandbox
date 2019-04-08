package cc.before30.algex.tree;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTree {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        return leafNodes(root1).equals(leafNodes(root2));
    }

    public List<Integer> leafNodes(TreeNode root) {
        List<Integer> leaves = new ArrayList<>();
        retrieveTree(root, leaves);
        return leaves;
    }

    public void retrieveTree(TreeNode node, List<Integer> leaves) {
        if (node.left == null && node.right == null) {
            leaves.add(node.val);
        }

        if (node.left != null) {
            retrieveTree(node.left, leaves);
        }

        if (node.right != null) {
            retrieveTree(node.right, leaves);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
