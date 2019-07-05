package com.company;


import java.util.Arrays;

public class Solution654 {
    public static void main(String[] args) {
        int[] a = new int[]{3,2,1,6,0,5};
        TreeNode k = constructMaximumBinaryTree(a);
        int b =k.val;

    }

      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

        public static TreeNode constructMaximumBinaryTree(int[] nums) {
            if(nums.length==0){
                return null;
            }
            int p = getMaxNumPosition(nums);
            TreeNode m =new TreeNode(nums[p]);
            int[] leftArray = Arrays.copyOfRange(nums,0,p);
            int[] rightArray = Arrays.copyOfRange(nums,p+1,nums.length);
            m.left = constructMaximumBinaryTree(leftArray);
            m.right = constructMaximumBinaryTree(rightArray);
            return m;
        }

        public static int getMaxNumPosition(int[] nums){
        int max = nums[0];
        int position = 0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]>max){
                    max = nums[i];
                    position = i;
                }
            }
            return position;
        }

}
