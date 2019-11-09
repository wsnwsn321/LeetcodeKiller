package com.company.CompanyList.Amazon;

import java.util.List;

public class DiameterOfNaryTree {
    public static void main(String[] args) {

    }
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public int diamaterOfN(Node root){
        if (root==null) return 0;
        curDiameter(root);
        return res;
    }
    int res=0;
    public int curDiameter(Node root){
        if (root==null) return 0;
        if (root.children.size()==0) return 1;
        int max1 =0,max2=0;
        for (Node x:root.children){
            int h = curDiameter(x);
            if (max1<h){
                max2 =max1;
                max1=h;
            }
            else if (max2<h) max2=h;
        }
        res = Math.max(res,max1+max2);
        return max1+1;
    }
}
