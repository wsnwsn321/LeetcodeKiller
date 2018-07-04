package com.company;

import java.util.*;

public class Solution728 {
    public static void main(String[] args) {
    int left =68;
    int right  =706;
        List<Integer> selfD = new ArrayList<>();
        selfD = selfDividingNumbers(left,right);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfD = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(checkSelfDivide(i)){
                selfD.add(i);
            }

        }
    return selfD;
    }

    public static boolean checkSelfDivide(int name){
        if(name ==0) return false;
        if (name <10) return true;
        int temp =name;
        while(temp>=10){
            int lastDigit = temp %10;
            if(lastDigit==0||name %lastDigit!=0){
                return false;
            }
            temp /=10;
            if(temp<10) {
                if(name%temp!=0) return false;
            }
        }
        return true;
    }
}
