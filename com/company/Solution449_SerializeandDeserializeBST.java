package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution449_SerializeandDeserializeBST {
    public static void main(String[] args) {

    }
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            return rserialize(root, new StringBuilder()).toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if(data.length()==0) return null;
            String[] values = data.split(",");
            List<Integer> nums = new ArrayList<>();
            for (String s : values)
                nums.add(Integer.valueOf(s));
            return decoding(nums, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        //preorder traversal
        public StringBuilder rserialize(TreeNode root, StringBuilder sb) {
            if (root == null) {
                return sb;
            }
            sb = sb.append(root.val + ",");
            sb = rserialize(root.left, sb);
            sb = rserialize(root.right, sb);
            return sb;
        }

        public TreeNode decoding(List<Integer> nums, int lower, int higher) {
            if (nums.size() == 0) return null;
            if (nums.get(0) < lower || nums.get(0) > higher) return null;
            TreeNode node = new TreeNode(nums.get(0));
            nums.remove(0);
            node.left = decoding(nums, lower, node.val);
            node.right = decoding(nums, node.val, higher);
            return node;
        }
    }
}
