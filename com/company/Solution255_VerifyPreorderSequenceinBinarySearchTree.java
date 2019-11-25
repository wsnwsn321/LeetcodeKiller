package com.company;

import java.util.Stack;

public class Solution255_VerifyPreorderSequenceinBinarySearchTree {
    public static void main(String[] args) {

    }
    public boolean verifyPreorder(int[] preorder) {
        Stack<Integer> pre = new Stack<>();
        Stack<Integer> inorder = new Stack<>();
        for (int x:preorder){
            if (inorder.size()>0&&x<inorder.peek())
                return false;
            while (pre.size()>0&&x>pre.peek()){
                inorder.push(pre.pop());
            }
            pre.push(x);
        }
        return true;
    }
}
