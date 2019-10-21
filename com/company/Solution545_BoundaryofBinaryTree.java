package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution545_BoundaryofBinaryTree {
    public static void main(String[] args) {

    }
    List<Integer> res = new ArrayList<>();
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if (root==null) return res;
        res.add(root.val);
        printLeft(root.left);
        printLeaf(root.left);
        printLeaf(root.right);
        printRight(root.right);
        return res;

    }
    public void printLeft(TreeNode root){
        if (root==null||(root.left==null&&root.right==null)) return;
        res.add(root.val);
        if (root.left==null) printLeft(root.right);
        else printLeft(root.left);
    }

    public void printLeaf(TreeNode root){
        if (root==null) return;
        if (root.left==null&&root.right==null) {
            res.add(root.val);
            return;
        }
        printLeft(root.left);
        printRight(root.right);
    }

    public void printRight(TreeNode root){
        if (root==null||(root.left==null&&root.right==null)) return;
        if (root.right==null) printRight(root.left);
        else printRight(root.right);
        res.add(root.val);
    }


}
