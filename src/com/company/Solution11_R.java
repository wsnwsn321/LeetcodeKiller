package com.company;

public class Solution11_R {
    public static void main(String[] args) {

    }
    public static int maxArea(int[] height) {
        int ans = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            ans = Math.max(ans, Math.min(height[left], height[right]) * (right - left));
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}


