package com.company.Amazon;

import java.util.List;

public class SubtreewithMaximumAverage {
    public static void main(String[] args) {

    }
    public class Node {
        public int val;
        public List<Node> children;
        public Node() {}
        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    double max =Integer.MIN_VALUE;
    Node maxNode =null;
    public Node maximumAverageSubtree(Node root) {
        if (root==null) return null;
        helper(root);
        return maxNode;
    }
    public double[] helper(Node root){
        if (root==null) return new double[]{0,0};
        int sum =root.val;int count = 1;
        for (Node c:root.children){
            double[] res = helper(c);
            sum+=res[0];
            count+=res[1];
        }
        double avg = sum/count;
        if (count>1&&avg>max){
            max = avg;
            maxNode = root;
        }
        return new double[]{sum,count};
    }
}
