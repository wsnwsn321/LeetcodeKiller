package src.com.company;


import java.util.ArrayList;
import java.util.List;

public class Solution199_BinaryTreeRightSideView {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> helper = new ArrayList<>();
        levelView(root,helper,0);
        List<Integer> res = new ArrayList<>();
        for (List<Integer> l:helper){
            res.add(l.get(l.size()-1));
        }
        return res;
    }

    public void levelView(TreeNode root,List<List<Integer>> res,int level){
        if(root==null) return;
        if(res.size()<level)res.add(new ArrayList<>());
        res.get(level).add(root.val);
        levelView(root.left,res,level+1);
        levelView(root.right,res,level+1);

    }
}
