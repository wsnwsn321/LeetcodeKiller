package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution515_FindLargestValueinEachTreeRow {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public List<Integer> largestValues(TreeNode root) {
        List<List<Integer>> levels= new ArrayList<>();
        int depth =0;
        travel(root,levels,0);
        List<Integer> result = new ArrayList<>();
        for (List<Integer> p:levels){
            result.add(p.get(0));
        }
        return result;

    }

    public void travel(TreeNode root,List<List<Integer>> levels, int depth ){
        if (root==null )return;
        if (levels.size()<=depth) levels.add(new ArrayList<>());
        if (levels.get(depth).size()==0) levels.get(depth).add(root.val);
        else
            levels.get(depth).set(0,Math.max(levels.get(depth).get(0),root.val));
        travel(root.left,levels,depth+1);
        travel(root.right,levels,depth+1);
    }
}
