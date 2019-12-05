package com.company;

import java.util.Stack;

public class Solution426_ConvertBinarySearchTreetoSortedDoublyLinkedList {
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
    public static void main(String[] args) {

    }
    public Node treeToDoublyList(Node root) {
        if (root == null) return root;
        Node dummy = new Node();
        Node prev = dummy;
        Stack<Node> stack = new Stack();
        Node curr = root;

        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            prev.right = curr;
            curr.left = prev;
            prev = curr;
            curr = curr.right;
        }
        dummy.right.left = prev;
        prev.right = dummy.right;
        return dummy.right;
    }
}
