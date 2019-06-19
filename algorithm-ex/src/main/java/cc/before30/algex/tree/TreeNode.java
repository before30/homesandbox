package cc.before30.algex.tree;

/**
 * TreeNode
 *
 * @author before30
 * @since 2019-06-19
 */

public class TreeNode {
    public final int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public void add(int x) {
        if (val > x) {
            if (left == null) {
                left = new TreeNode(x);
            } else {
                left.add(x);
            }
        } else {
            if (right == null) {
                right = new TreeNode(x);
            } else {
                right.add(x);
            }
        }
    }

    public static TreeNode createTree(int[] array) {
        if (array.length <= 0) {
            return null;
        }

        TreeNode root = new TreeNode(array[0]);
        for (int i = 1; i < array.length; i++) {
            root.add(array[i]);
        }

        return root;
    }

}
