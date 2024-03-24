package random;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


class DeleteNodesAndReturnForest {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> nodes = new ArrayList<TreeNode>();
        Set<Integer> valuesToDelete = new HashSet<Integer>();
        for (int value : to_delete) {
            valuesToDelete.add(value);
        }
        if (!valuesToDelete.contains(root.val)) {
            nodes.add(root);
        }
        traverse(root, valuesToDelete, nodes);
        return nodes;
    }

    private TreeNode traverse(TreeNode root, Set<Integer> valuesToDelete, List<TreeNode> nodes) {
        if (root == null) {
            return null;
        }

        root.left = traverse(root.left, valuesToDelete, nodes);
        root.right = traverse(root.right, valuesToDelete, nodes);

        if (valuesToDelete.contains(root.val)) {
            if (root.left != null) {
                nodes.add(root.left);
            }
            if (root.right != null) {
                nodes.add(root.right);
            }
            return null;
        }
        return root;
    }
}
