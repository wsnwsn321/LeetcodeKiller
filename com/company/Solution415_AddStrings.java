package com.company;

public class Solution415_AddStrings {
    public static void main(String[] args) {

    }
    //time:     O(max(n1,n2))
    //space:    O(max(n1,n2))
    public String addStrings(String num1, String num2) {
        int i1 = num1.length()-1,i2=num2.length()-1;
        StringBuilder sb = new StringBuilder();
        int up=0;
        while (i1>=0||i2>=0){
            int n1 = i1>=0?num1.charAt(i1)-'0':0;
            int n2 = i2>=0?num2.charAt(i2)-'0':0;
            int sum = n1+n2+up;
            up = sum/10;
            sb.append(sum%10);
            i1--;i2--;
        }
        return sb.reverse().toString();
    }
}
