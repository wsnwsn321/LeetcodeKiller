package com.company;

public class Solution476 {
    public static void main(String[] args) {
        int num =16;
        findComplement(num);
    }
    public static int findComplement(int num) {
        return ~num + (Integer.highestOneBit(num) << 1);
    }
}