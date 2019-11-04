package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution297_SerializeandDeserializeBinaryTree {
    public static void main(String[] args) {

    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            String res = "";
            Stack<TreeNode> s = new Stack<>();
            s.push(root);
            while (!s.isEmpty()){
                TreeNode cur = s.pop();
                res+=cur.val;
                if (cur.right!=null)
                    s.push(cur.right);
                if (cur.left!=null)
                    s.push(cur.left);
            }
            return res;
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            return null;
        }
    }
}
