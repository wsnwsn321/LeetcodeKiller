package com.company;

public class Solution415_AddStrings {
    public static void main(String[] args) {

    }
    //time:     O(max(n1,n2))
    //space:    O(max(n1,n2))
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i=num1.length()-1,j=num2.length()-1,up=0;
        while (i>=0||j>=0){
            char c1 = i>=0?num1.charAt(i):'0';
            char c2 = j>=0?num2.charAt(j):'0';
            int sum = (c1-'0')+(c2-'0')+up;
            up = sum/10;
            sb.append(sum%10);
            i--;j--;
        }
        if (up>=1) sb.append('1');
        return sb.reverse().toString();
    }
}
