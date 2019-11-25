package com.company;

public class Solution42_TrappingRainWater {
    public static void main(String[] args) {
        int[] s = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        //trap(s);
    }
    public int trap(int[] height){
        int ans = 0;
        int l_max = 0,r_max = 0;
        int l=0,r =height.length-1;
        while (l<=r){
            l_max = Math.max(l_max,height[l]);
            r_max = Math.max(r_max,height[r]);
            if (l_max<r_max){
                ans+=l_max-height[l++];
            }
            else
                ans+=r_max-height[r--];
        }
        return ans;
    }

}
