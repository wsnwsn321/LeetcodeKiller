package src.com.company;

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.List;

public class Solution129_SumRoottoLeafNumbers {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    public int sum(TreeNode n, int s){
        if (n == null) return 0;
        if (n.right == null && n.left == null) return s*10 + n.val;
        return sum(n.left, s*10 + n.val) + sum(n.right, s*10 + n.val);
    }
//    public int sumNumbers(TreeNode root) {
//        List<StringBuilder> nums = new ArrayList<>();
//        dfs(root,new StringBuilder(),nums);
//        int sum =0;
//        for (StringBuilder x:nums){
//            sum+=Integer.parseInt(x.toString());
//        }
//        return sum;
//    }
//    public void dfs(TreeNode root,StringBuilder temp, List<StringBuilder> nums){
//        if (root==null) return;
//        temp.append(root.val);
//        if (root.left==null&&root.right==null){
//            nums.add(new StringBuilder(temp));
//            return;
//        }
//        if (root.left!=null){
//            dfs(root.left,temp,nums);
//            temp.deleteCharAt(temp.length()-1);
//        }
//        if (root.right!=null){
//            dfs(root.right,temp,nums);
//            temp.deleteCharAt(temp.length()-1);
//        }
//    }
}
