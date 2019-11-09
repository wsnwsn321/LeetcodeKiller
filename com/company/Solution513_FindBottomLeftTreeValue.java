package com.company;

import java.util.*;

public class Solution513_FindBottomLeftTreeValue {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> s = new LinkedList<>();
        s.offer(root);
        int res=0;
        while (s.size()>0){
            int size = s.size();
            if (size>0) res = s.peek().val;
            while (size>0){
                TreeNode cur = s.poll();
                if (cur.left!=null)
                    s.offer(cur.left) ;
                if (cur.right!=null)
                    s.offer(cur.right);
                size--;
            }
        }
        return res;
    }

}
