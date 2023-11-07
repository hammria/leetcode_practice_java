package tree;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTree {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        addToLeaves(root1, leaves1);
        addToLeaves(root2, leaves2);
        if (leaves1.size() != leaves2.size()) {
            return false;
        }
        for (int i = 0; i < leaves1.size(); i++) {
            if (!leaves1.get(i).equals(leaves2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private void addToLeaves(TreeNode root, List<Integer> leaves) {
        if (root.left != null) {
            addToLeaves(root.left, leaves);
        }
        if (root.right != null) {
            addToLeaves(root.right, leaves);
        }
        if (root.left == null && root.right == null) {
            leaves.add(root.val);
        }
    }

}
