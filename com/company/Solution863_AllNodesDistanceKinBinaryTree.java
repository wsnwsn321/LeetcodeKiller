package com.company;

import java.util.*;

public class Solution863_AllNodesDistanceKinBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    Map<TreeNode,TreeNode> parents = new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
       dfs(root,null);
       List<Integer> res = new ArrayList<>();
       Queue<TreeNode> q = new LinkedList<>();
       Set<TreeNode> seen = new HashSet();
       q.offer(target);
       int dis=0;
       while (q.size()>0){
           if (dis==K){
               while (q.size()>0){
                   res.add(q.poll().val);
               }
               return res;
           }
           int size = q.size();
           for (int i=0;i<size;++i){
               TreeNode cur = q.poll();
               seen.add(cur);
               if (parents.get(cur)!=null&&!seen.contains(parents.get(cur)))
                   q.offer(parents.get(cur));
               if (cur.left!=null&&!seen.contains(cur.left)) q.offer(cur.left);
               if (cur.right!=null&&!seen.contains(cur.right)) q.offer(cur.right);
           }
           dis++;
       }
       return new ArrayList<>();

    }
    public void dfs(TreeNode node, TreeNode par) {
        if (node == null) return;
        parents.put(node, par);
        dfs(node.left, node);
        dfs(node.right, node);
    }

}
