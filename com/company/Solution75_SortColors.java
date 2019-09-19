package com.company;

public class Solution75_SortColors {
    public static void main(String[] args) {

    }
    public void sortColors(int[] nums) {
        int zero=0,two =nums.length-1;
        int i=0;
        while (i<=two){
            if (nums[i]==1) i++;
            if (nums[i]==0){
                nums[i] = nums[zero];
                nums[zero++] = 0;
                i++;

            }
            if (nums[i]==2)
                nums[i]=nums[two];
                nums[two--] = 2;
                i++;
            }
        }
    }

}
