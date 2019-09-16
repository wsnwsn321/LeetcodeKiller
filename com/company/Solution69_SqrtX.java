package com.company;

public class Solution69_SqrtX {
    public static void main(String[] args) {

    }
    //time:     O(logn)
    //space:    O(1)
    public int mySqrt(int x) {
        if(x==0||x==1) return x;
        long l=0,r=x;
        while (l<r){
            long mid = (l+r)/2;
            if (mid*mid<=x&&x<(mid+1)*(mid+1))
                return (int)mid;
            else if (mid*mid>x){
                r=mid;
            }
            else {
                l=mid;
            }

        }
        return 0;
    }
}
