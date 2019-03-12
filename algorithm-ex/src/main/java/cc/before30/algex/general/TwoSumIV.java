package cc.before30.algex.general;

import java.util.ArrayList;
import java.util.List;

public class TwoSumIV {


    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = treeToList(root);

        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            if (list.get(i) + list.get(j) < k) {
                i++;
            } else if (list.get(i) + list.get(j) > k) {
                j--;
            } else {
                return true;
            }
        }

        return false;
    }

    List<Integer> treeToList(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverseTree(root, list);

        return list;
    }

    void traverseTree(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        list.add(node.val);
        traverseTree(node.left, list);
        traverseTree(node.right, list);
    }



}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
