package src.com.company;

public class Solution98_ValidateBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public boolean isValidBST(TreeNode root) {
        return dfs(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
    public boolean dfs(TreeNode root, int max, int min){
        if (root==null) return true;
        if (root.val>max||root.val<min) return false;
        return dfs(root.left,root.left.val,min)&&dfs(root.right,max,root.right.val);
    }
}
