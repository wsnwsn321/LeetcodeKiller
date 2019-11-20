package com.company;

public class Solution42_TrappingRainWater {
    public static void main(String[] args) {
        int[] s = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        //trap(s);
    }
    public int trap(int[] A){
        int l_max=0 ,r_max=0;
        int area = 0;
        int l=0,r = A.length-1;
        while (l<r){
            l_max = Math.max(A[l],l_max);
            r_max = Math.max(A[r],r_max);
            if (l_max<r_max){
                area+=l_max-A[l++];
            }
            else {
                area+=r_max - A[r--];
            }
        }
        return area;
    }

}
