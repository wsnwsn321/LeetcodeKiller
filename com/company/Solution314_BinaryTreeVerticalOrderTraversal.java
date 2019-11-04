package com.company;

import java.util.*;

public class Solution314_BinaryTreeVerticalOrderTraversal {
    public static void main(String[] args) {

    }
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        int mostLeft=0;
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        HashMap<TreeNode, Integer> weight = new HashMap<TreeNode, Integer>();
        queue.offer(root);
        weight.put(root,0);
        while (queue.size()>0){
            TreeNode cur = queue.poll();
            int colNum = weight.get(cur);
            if (!map.containsKey(colNum))
                map.put(colNum,new ArrayList<>());
            map.get(colNum).add(cur.val);
            if (cur.left!=null){
                queue.offer(cur.left);
                weight.put(cur.left,colNum-1);
                mostLeft = Math.min(mostLeft,colNum-1);
            }
            if (cur.right!=null){
                queue.offer(cur.right);
                weight.put(cur.right,colNum+1);
            }
        }
        for (int x:map.keySet()){
            res.add(map.get(x));
        }
        return res;

    }
}
