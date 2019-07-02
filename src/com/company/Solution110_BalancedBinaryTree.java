package src.com.company;
public class Solution110_BalancedBinaryTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public boolean isBalanced(TreeNode root) {
        return checkBalance(root)==-1;
    }
    public int checkBalance( TreeNode root){
        if(root==null) return 0;
        int leftH = checkBalance(root.left);
        if(leftH==-1) return -1;
        int rightH = checkBalance(root.right);
        if(rightH==-1) return -1;
        if(Math.abs(leftH-rightH)>1) return -1;
        return Math.max(leftH,rightH)+1;
    }
}
