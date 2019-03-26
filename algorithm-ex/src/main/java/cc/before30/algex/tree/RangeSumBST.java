package cc.before30.algex.tree;

public class RangeSumBST {

    public int rangeSumBST(MaximumDepthOfBinaryTree.TreeNode root, int L, int R) {
        return sum(root, L, R, 0);
    }

    public int sum(MaximumDepthOfBinaryTree.TreeNode node, int l, int r, int sum) {
        if (node == null) {
            return sum;
        }
        if (node.val >= l &&  node.val <= r) {
            return sum(node.left, l, r, 0) + sum(node.right, l, r, 0) + sum + node.val;
        } else if (node.val < l) {
            return sum(node.right, l, r, 0) + sum;
        } else {
            return sum(node.left, l, r, 0) + sum;
        }
    }
}
