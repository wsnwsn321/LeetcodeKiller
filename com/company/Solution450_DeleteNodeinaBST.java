package com.company;

public class Solution450_DeleteNodeinaBST {
    public static void main(String[] args) {

    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root==null)
            return null;
        if (root.val<key){
            root.right = deleteNode(root.right,key);
        }
        else if (root.val>key){
            root.left = deleteNode(root.left,key);
        }
        else {
            if (root.left==null&&root.right==null){
                root= null;
            }
            else if (root.left==null||root.right==null){
                root= root.left==null?root.right:root.left;
            }
            else {
                root.val = findSuccessor(root.right);
                root.right = deleteNode(root.right,root.val);
            }
        }
        return root;
    }

    public  int findSuccessor(TreeNode root){
        while (root.left != null) root = root.left;
        return root.val;
    }
}
