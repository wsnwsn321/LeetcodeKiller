package src.com.company;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Solution94_BinaryTreeInorderTraversal {
      public class TreeNode {
          int val;
          TreeNode left;
         TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public static void main(String[] args) {

    }
    public List<Integer> inorderTraversal(TreeNode root) {
          List<Integer> ret = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;
        while(curr!=null||!s.isEmpty()){
           while (curr!=null){
               s.push(curr);
               curr = curr.left;
           }
           curr = s.pop();
           ret.add(curr.val);
           curr = curr.right;

        }
        return ret;

    }
    public void Travel(TreeNode root,List<Integer> ret){
        if(root==null) return;
        Travel(root.left,ret);
        ret.add(root.val);
        Travel(root.right,ret);

    }
}
