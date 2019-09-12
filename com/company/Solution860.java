package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution860 {
    public static void main(String[] args) {

    }

    public static boolean lemonadeChange(int[] bills) {
        int fives =0, tens =0;
        for(int b: bills){
            if(b==5) fives++;
            if(b==10){
                if(fives==0) return false;
                else{
                    fives--;
                    tens++;

                }
            }
            if(b==20){
                if(fives==0) return false;
                if(tens==0){
                    if(fives>3){
                        fives-=3;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    tens--;
                    fives--;
                }
            }
        }
        return true;

    }



}
