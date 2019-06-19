package cc.before30.algex.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * KthSmallestElementInABST
 *
 * @author before30
 * @since 2019-06-19
 */
public class KthSmallestElementInABST {
    public int kthSmallest(TreeNode root, int k) {
        List<TreeNode> sortedList = traverse(root, new ArrayList<TreeNode>());
        return sortedList.get(k-1).val;
    }

    public List<TreeNode> traverse(TreeNode node, List<TreeNode> list) {
        if (node == null) {
            return list;
        }

        traverse(node.left, list);
        list.add(node);
        traverse(node.right, list);

        return list;
    }
}
