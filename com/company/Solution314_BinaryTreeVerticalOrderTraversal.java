package com.company;

import java.util.*;

public class Solution314_BinaryTreeVerticalOrderTraversal {
    public static void main(String[] args) {

    }
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root==null) return res;
        Map<TreeNode, Integer> map = new HashMap<>();
        TreeMap<Integer,List<Integer>> level = new TreeMap<>();
        map.put(root,0);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (queue.size()>0){
            int size = queue.size();
            for (int i=0;i<size;++i){
                TreeNode cur = queue.poll();
                if (level.containsKey(map.get(cur)))
                    level.put(map.get(cur),new ArrayList<>());
                level.get(map.get(cur)).add(cur.val);
                if (cur.left!=null){
                    map.put(cur.left,map.get(cur)-1);
                    queue.offer(cur.left);
                }
                if (cur.right!=null){
                    map.put(cur.right,map.get(cur)+1);
                    queue.offer(cur.right);
                }
            }
        }
        for (int l:level.keySet()){
            res.add(level.get(l));
        }
        return res;
    }
}
