package com.company.CompanyList.Oracle;

public class BasicCaculator {
    public static void main(String[] args) {
        System.out.println(calculate("1-23-4+71"));
    }

    public static int calculate(String s) {

        int operand = 0;
        int result = 0; // For the on-going result
        int sign = 1;  // 1 means positive, -1 means negative

        for (char ch : s.toCharArray()){
            if (Character.isDigit(ch))
                operand = operand*10+(ch-'0');

            else if (ch=='+'){
                result+=sign*operand;
                sign = 1;
                operand =0;
            }

            else if (ch=='-'){
                result+=sign*operand;
                sign = -1;
                operand =0;
            }
        }
        return result+sign*operand;
    }
}
