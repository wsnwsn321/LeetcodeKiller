package com.company;

public class Solution75_SortColors {
    public static void main(String[] args) {

    }

    public void sortColors(int[] nums) {
        int zero = 0, two = nums.length-1;
        int index=0;
        while (zero<=two){
            if (nums[index]==0){
                nums[index++] = nums[zero];
                nums[zero++] = 0;
            }
            else if (nums[index]==2){
                nums[index] = nums[two];
                nums[two--] = 2;
            }
            else index++;
        }
    }
}
