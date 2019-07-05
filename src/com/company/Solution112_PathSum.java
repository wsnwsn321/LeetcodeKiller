package src.com.company;

public class Solution112_PathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean hasPathSum(TreeNode root, int sum) {
         return travel(root,sum,0);

    }

    public boolean travel(TreeNode root, int sum,int currentSum){
        if(root==null) return false;
        if(root.left==null&&root.right==null){
            if(currentSum+root.val==sum){
                return true;
            }
        }
        return travel(root.left,sum,currentSum+root.val)||travel(root.right,sum,currentSum+root.val);
    }
}