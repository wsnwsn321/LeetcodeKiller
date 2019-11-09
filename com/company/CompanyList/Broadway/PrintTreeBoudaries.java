package com.company.CompanyList.Broadway;


import java.util.ArrayList;
import java.util.List;

public class PrintTreeBoudaries {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        one.right =two;
        one.left  =null;
        two.left=three;
        two.right = four;
        boundaryOfBinaryTree(one);
        for (int x:res){
            System.out.print(x+",");

        }

    }
    static List<Integer> res = new ArrayList<>();
    public static List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if (root==null) return res;
        printLeft(root);
        printLeaf(root.left);
        printLeaf(root.right);
        printRight(root);
        return res;
    }
    public static void printLeft(TreeNode root){
        if (root==null||(root.left==null&&root.right==null))
            return;
        res.add(root.val);
        if (root.left==null)
            printLeft(root.right);
        else printLeft(root.left);
    }
    public static void printRight(TreeNode root){
        if (root==null||(root.left==null&&root.right==null))
            return;
        if (root.right==null)
            printRight(root.left);
        else printLeft(root.right);
        res.add(root.val);
    }
    public static void printLeaf(TreeNode root){
        if (root==null)
            return;
        if (root.left==null&&root.right==null)
            res.add(root.val);
        printLeaf(root.left);
        printLeaf(root.right);
    }

}
