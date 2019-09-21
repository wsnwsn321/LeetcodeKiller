package com.company.ibm;

public class MinMove {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,0,0,0,0,0,1};
        int moves =minMove(arr);
        int q =1;
    }
    public static int minMove(int[] arr){
        int countZero = 0;
        for (int x:arr){
            if (x==0) countZero++;
        }
        int zeroPosition=0;
        for (int i=0;i<arr.length;++i){
            if (arr[i]==0) zeroPosition+=i;
        }
        int zeroAtLeft =0,zeroAtRight=0;
        for (int i=0;i<countZero;++i){
            zeroAtLeft+=i;
            zeroAtRight+=arr.length-1-i;
        }
        return Math.min(zeroPosition-zeroAtLeft,zeroAtRight-zeroPosition);
    }
}
