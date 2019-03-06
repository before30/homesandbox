package cc.before30.algex.tree;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderTraversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> postorder(Node root) {
        List<Integer> rval = new ArrayList<>();

        postorderTraversal(root, rval);
        rval.add(root.val);
        return rval;
    }

    public void postorderTraversal(Node node, List<Integer> list) {
        if (node == null) {
            return;
        }

        for (Node n : node.children) {
            postorderTraversal(n, list);
            list.add(n.val);
        }
    }


}
