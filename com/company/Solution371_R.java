package com.company;

import java.util.Map;

public class Solution371_R {
    public static void main(String[] args) {
        int a=-1;
        int b=16;
        getSum(a,b);
    }
    public static int getSum(int a, int b) {
            //Sum of two bits can be obtained by performing XOR (^) operation of two bits.
            //Carry bit can be obtained by performing AND (&) operation of two bits
            while(b != 0) {
                int carry = a & b;
                a = a ^ b;
                b = carry << 1;
            }
            return a;

    }

}
