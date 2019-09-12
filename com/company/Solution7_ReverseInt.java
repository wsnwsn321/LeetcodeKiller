package com.company;

public class Solution7_ReverseInt {
    public static void main(String[] args) {

        int x =1534236469;
        reverse(x);
    }
    //time: O(n) length if x
    //space: O(1)
    public static int reverse(int x) {
        boolean flag = false;
        if (x<0) flag =true;
        x = Math.abs(x);
        int res = 0;
        char[] digits = Integer.toString(x).toCharArray();
        for (int i=0;i<digits.length;++i){
            res+=(digits[i]-'0')*Math.pow(10,i);
            if (res>Integer.MAX_VALUE) return 0;
        }
        return flag?-res:res;
    }
}
