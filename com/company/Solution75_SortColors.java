package com.company;

public class Solution75_SortColors {
    public static void main(String[] args) {

    }

    public void sortColors(int[] nums) {
        int zero=0;
        int two = nums.length-1;
        int i=0;
        while (i<nums.length){
            if (nums[i]==0){
                int temp = nums[zero];
                nums[zero++] =0;
                nums[i] = temp;
            }
            else if (nums[i]==2){
                int temp = nums[two];
                nums[two--] =2;
                nums[i] = temp;
            }
            else i++;
        }
    }
}
