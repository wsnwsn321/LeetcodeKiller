package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution285_InorderSuccessorinBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    List<Integer> nodes = new ArrayList<>();
    TreeNode res = null;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        travel(root,p);
        return res;

    }
    public void travel(TreeNode root,TreeNode p){
        if (root==null||res!=null) return;
        if (nodes.size()>0&&nodes.get(nodes.size()-1)==p.val){
            res = root;
        }
        travel(root.left,p);
        nodes.add(root.val);
        travel(root.right,p);
    }

}
