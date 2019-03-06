package cc.before30.algex.tree;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> preorder(Node root) {
        List<Integer> rval = new ArrayList<>();
        preorderTraversal(root, rval);

        return rval;
    }

    public void preorderTraversal(Node node, List<Integer> list) {
        if (node == null) {
            return;
        }

        list.add(node.val);
        for (Node n : node.children) {
            preorderTraversal(n, list);
        }
    }
}
