package com.company;

import java.util.*;

public class Solution728_SelfDividingNumbers {
    public static void main(String[] args) {
    int left =68;
    int right  =706;
        List<Integer> selfD = new ArrayList<>();
        selfD = selfDividingNumbers(left,right);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i=left;i<=right;++i){
            int cur = i;
            boolean flag = true;
            while (cur>0){
                int digit = cur%10;
                if (digit==0||i%digit!=0){
                    flag = false;
                    break;
                }
                cur/=10;
            }
            if (flag)
                res.add(i);
        }
        return res;
    }

}
