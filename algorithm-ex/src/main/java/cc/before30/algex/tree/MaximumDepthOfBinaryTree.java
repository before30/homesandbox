package cc.before30.algex.tree;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class MaximumDepthOfBinaryTree {
    int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        traverse(root, 1);
        return maxDepth;
    }

    public void traverse(TreeNode node, int currentDepth) {
        if (node == null)
            return;
        maxDepth = Math.max(maxDepth, currentDepth);
        traverse(node.left, currentDepth + 1);
        traverse(node.right, currentDepth + 1);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
