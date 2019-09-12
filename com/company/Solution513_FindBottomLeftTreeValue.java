package com.company;

import java.util.ArrayList;
import java.util.List;

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
        List<List<Integer>> levels = new ArrayList<>();
        int depth =0;
        travel(root,levels,0);
        return levels.get(levels.size()-1).get(0);
    }
    public void travel(TreeNode root,List<List<Integer>> levels, int depth ){
        if (root==null )return;
        if (levels.size()<=depth) levels.add(new ArrayList<>());
        levels.get(depth).add(root.val);
        travel(root.left,levels,depth+1);
        travel(root.right,levels,depth+1);
    }
}
