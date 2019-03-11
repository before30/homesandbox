package cc.before30.algex.tree;

import java.util.Stack;

public class MinimumDepthOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int minDepth(TreeNode root) {

        int depth = 1;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Stack<TreeNode> tempStack = new Stack<>();

            for(TreeNode node : stack) {
                if (node != null) {
                    if (node.left == null && node.right == null) {
                        return depth;
                    } else if (node.left != null &&
                            node.right == null) {
                        tempStack.add(node.left);
                    } else if (node.left == null &&
                            node.right != null) {
                        tempStack.add(node.right);
                    } else {
                        tempStack.add(node.left);
                        tempStack.add(node.right);
                    }
                }
            }

            stack = tempStack;
            depth++;
        }



        return depth;
    }
}
