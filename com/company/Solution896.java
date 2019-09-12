package com.company;

public class Solution896 {
    public static void main(String[] args) {
        int [] A = new int[]{1,2,2,3};
        isMonotonic(A);

    }
    public static boolean isMonotonic(int[] A) {
        boolean inc =false;
        boolean dec =false;
       for(int i=1;i<A.length;i++){
           if(A[i]>A[i-1]){
               inc = true;
               if(dec ==true) return false;
           }
           else if(A[i]<A[i-1]){
               dec = true;
               if(inc ==true) return false;
           }
       }
       return true;

    }
}
