package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution545_BoundaryofBinaryTree {
    public static void main(String[] args) {

    }
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        res.add(root.val);
        printLeft(root.left,res);
        printLeaf(root.left,res);
        printLeaf(root.right,res);
        printRight(root.right,res);
        return res;
    }

    public void printLeft(TreeNode root, List<Integer> res){
        if (root==null||(root.left==null&&root.right==null)) return;
        res.add(root.val);
        if (root.left!=null) printLeft(root.left,res);
        else  printLeft(root.right,res);
    }
    public void printLeaf(TreeNode root, List<Integer> res){
        if (root==null) return;
        if (root.left==null&&root.right==null) {
            res.add(root.val);
            return;
        }
        printLeaf(root.left,res);
        printLeaf(root.right,res);
    }
    public void printRight(TreeNode root, List<Integer> res){
        if (root==null||(root.left==null&&root.right==null)) return;
        if (root.right!=null) printRight(root.right,res);
        else  printRight(root.left,res);
        res.add(root.val);
    }
}
