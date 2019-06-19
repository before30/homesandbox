package cc.before30.algex.tree;

/**
 * SearchInABinarySearchTree
 *
 * @author before30
 * @since 2019-06-19
 */
public class SearchInABinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) {
            return null;
        } else if (root.val < val) {
            return searchBST(root.right, val);
        } else if (root.val > val) {
            return searchBST(root.left, val);
        } else {
            return root;
        }

    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
}
