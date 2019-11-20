package com.company;

public class Solution75_SortColors {
    public static void main(String[] args) {

    }

    public void sortColors(int[] nums) {
        int zero=0, two = nums.length-1;
        int cur=0;
        while (cur<=two){
            if (nums[cur]==0){
                nums[cur++] = nums[zero];
                nums[zero++]=0;
            }
            if (nums[cur]==2){
                nums[cur] = nums[two];
                nums[two--] = 2;
            }
        }
    }
}
