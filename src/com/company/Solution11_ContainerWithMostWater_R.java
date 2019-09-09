package com.company;

public class Solution11_ContainerWithMostWater_R {
    public static void main(String[] args) {

    }
    //time:     O(n)
    //space:    O(1)
    public  int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int maxArea=0;
        while (l<r){
            int area = Math.min(height[l],height[r])*(r-l);
            maxArea = Math.min(maxArea,area);
            if (height[l]<height[r])l++;
            else r--;
        }
        return maxArea;
    }
}


