import javax.swing.tree.TreeNode;

public TreeNode lowestCommonAns(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null)
        return null;
    if (root == p || root == q)
        return root;

    TreeNode leftSide = lowestCommonAns(root.left, p, q);
    TreeNode rightSide = lowestCommonAns(root.right, p, q);

    if (leftSide != null && rightSide != null)
        return root;
    if (leftSide != null)
        return leftSide;
    else
        return rightSide;
}