package com.company;

public class Solution42_TrappingRainWater {
    public static void main(String[] args) {
        int[] s = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        //trap(s);
    }
    public int trap(int[] A){
        int l=0,r=A.length-1;
        int res=0;
        int leftmax=0,rightmax=0;
        while(l<r){
            leftmax=Math.max(leftmax,A[l]);
            rightmax=Math.max(rightmax,A[r]);
            if(leftmax<rightmax){
                res+=(leftmax-A[l]);       // leftmax is smaller than rightmax, so the (leftmax-A[a]) water can be stored
                l++;
            }
            else{
                res+=(rightmax-A[r]);
                r--;
            }
        }
        return res;
    }

}
