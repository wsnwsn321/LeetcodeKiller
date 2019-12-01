package com.company;

import java.util.*;

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

        public StringBuilder rserialize(TreeNode root, StringBuilder sb) {
            // Recursive serialization.
            if (root == null) {
                sb.append("null,");
            } else {
                sb.append(root.val + ",");
                sb = rserialize(root.left, sb);
                sb = rserialize(root.right, sb);
            }
            return sb;
        }

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            return rserialize(root, new StringBuilder()).toString();
        }

        public TreeNode rdeserialize(List<String> l) {
            // Recursive deserialization.
            if (l.get(0).equals("null")) {
                l.remove(0);
                return null;
            }

            TreeNode root = new TreeNode(Integer.valueOf(l.get(0)));
            l.remove(0);
            root.left = rdeserialize(l);
            root.right = rdeserialize(l);

            return root;
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] data_array = data.split(",");
            List<String> data_list = new LinkedList<String>(Arrays.asList(data_array));
            return rdeserialize(data_list);
        }
    }
}
