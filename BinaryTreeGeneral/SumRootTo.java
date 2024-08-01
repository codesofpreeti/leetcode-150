package BinaryTreeGeneral;

public class SumRootTo {
    public int sumRoot(TreeNode root, sum){
        if(root==null) return 0;
        if(root.right==null && root.right==null) return root.val+sum*10;
        return sumRoot(root.left, sum*10+root.val) +sumRoot(root.right, sum*10+root.val);
    } 
}
