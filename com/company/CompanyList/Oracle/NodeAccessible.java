package com.company.CompanyList.Oracle;

import java.util.*;

public class NodeAccessible {
    public class Node{
        int val;
        public List<Node> getN;
        public boolean equals(int target){
            return target==this.val;
        }
    }

    public boolean canAccess(Node src, Node target){
        if (src.equals(target)) return true;
        Queue<Node> q = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        q.offer(src);
        visited.add(src);
        while (q.size()>0){
            Node cur = q.poll();
            if (cur.equals(target))
                return true;
            for (Node n:cur.getN){
                if (!visited.contains(n)){
                    q.offer(n);
                    visited.add(n);
                }
            }
        }
        return false;
    }
}
