package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution257_BinaryTreePaths {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        String p = "";
        if(root==null) return result;
        helpFunc(result,root,p);
        return result;
    }

    public void helpFunc(List<String> r, TreeNode root,String path){
        path += Integer.toString(root.val)+"->";
        if(root==null) return;
        if(root.left!=null){
            //path+=Integer.toString(root.left.val);
            helpFunc(r,root.left,path);
        }
        if(root.right!=null){
            //path+=Integer.toString(root.right.val);
            helpFunc(r,root.right,path);
        }
        if(root.left==null&&root.right==null){
            path = path.substring(0,path.length()-2);
            r.add(path);
        }
    }
}
