package random;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class IsEvenOddTree {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> qNodes = new LinkedList<>();
        qNodes.add(root);
        qNodes.add(null);
        int result = 1;
        int previous = 0;
        while (!qNodes.isEmpty()) {
            previous = (result % 2 == 0) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            while (qNodes.peek() != null) {
                if ((qNodes.peek().val % 2 != result % 2)
                        || (result % 2 == 0 && previous <= qNodes.peek().val)
                        || (result % 2 != 0 && previous >= qNodes.peek().val))
                {
                    return false;
                }
                if (qNodes.peek().left != null)
                    qNodes.add(qNodes.peek().left);
                if (qNodes.peek().right != null)
                    qNodes.add(qNodes.peek().right);
                previous = qNodes.poll().val;
            }
            qNodes.poll();
            if (qNodes.isEmpty()) {
                break;
            }
            result++;
            qNodes.add(null);

        }
        return true;
    }
}
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */