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
        List<Integer> res = new ArrayList<>();
        if (root==null) return res;
        buildParentTree(root,null);
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        q.offer(target);
        visited.add(target);
        while (q.size()>0){
            if (K==0){
                while (q.size()>0){
                    res.add(q.poll().val);
                }
                return res;
            }
            int size = q.size();
            for (int i=0;i<size;++i){
                TreeNode cur = q.poll();
                visited.add(cur);
                if (cur.left!=null&&!visited.contains(cur.left)){
                    q.offer(cur.left);
                    visited.add(cur.left);
                }
                if (cur.right!=null&&!visited.contains(cur.right)){
                    q.offer(cur.right);
                    visited.add(cur.left);
                }
                if (parents.get(cur)!=null&&!visited.contains(parents.get(cur))){
                    q.offer(parents.get(cur));
                    visited.add(parents.get(cur));
                }
            }
            K--;
        }
        return res;
    }

    public void buildParentTree(TreeNode node,TreeNode parent){
        if (node ==null)return;
        parents.put(node,parent);
        buildParentTree(node.left,node);
        buildParentTree(node.right,node);
    }



}
