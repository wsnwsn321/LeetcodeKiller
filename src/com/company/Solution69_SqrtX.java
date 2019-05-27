package com.company;

public class Solution69_SqrtX {
    public static void main(String[] args) {

    }
    public int mySqrt(int x) {
        int l=0,r=x;
        while(l<r){
            int mid = (l+r)/2;
            if(x>=mid*mid&&x<=(mid+1)*(mid+1)){
                return mid;
            }
            else if(x<mid*mid){
                r = mid;
            }
            else{
                l=mid;
            }
        }
        return -1;
    }
}
