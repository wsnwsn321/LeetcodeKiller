package src.com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import src.com.company.Solution94_BinaryTreeInorderTraversal.TreeNode;
public class Solution144_BinaryTreePreorderTraversal {
    public static void main(String[] args) {

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        List<Integer> ret = new ArrayList<>();
        TreeNode curr = root;
        s.push(curr);
        while(!s.isEmpty()){
            curr = s.pop();
            ret.add(curr.val);
            if (curr.right!=null) s.push(curr.right);
            if(curr.left!=null) s.push(curr.left);

        }
        return ret;
    }
}
