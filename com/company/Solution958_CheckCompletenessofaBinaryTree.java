package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solution958_CheckCompletenessofaBinaryTree {
    public static void main(String[] args) {

    }
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean lack = false;
        while (q.size()>0){
            int size = q.size();
            for (int i=0;i<size;++i){
                TreeNode cur = q.poll();
                if (cur.left==null&&cur.right==null) {
                    lack = true;
                    continue;
                }
                if (cur.left!=null){
                    if (lack) return false;
                    else q.offer(cur.left);
                }
                else {
                    if (lack) return false;
                    lack = true;
                }
                if (cur.right!=null){
                    if (lack) return false;
                    else q.offer(cur.right);
                }
                else {
                    if (lack) return false;
                    lack = true;
                }
            }
        }
        return true;
    }
}
