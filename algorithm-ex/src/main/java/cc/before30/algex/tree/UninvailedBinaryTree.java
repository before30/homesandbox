package cc.before30.algex.tree;

public class UninvailedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {


        return retrieveTree(root, root.val);
    }

    public boolean retrieveTree(TreeNode node, int val) {
        if (node == null) {
            return true;
        }

        if (node.val == val) {
            return retrieveTree(node.left, val) && retrieveTree(node.right,val);
        } else {
            return false;
        }
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}