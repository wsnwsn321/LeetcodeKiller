package com.company;

public class Solution43_MultiplyStrings {
    public static void main(String[] args) {

    }
    //time:     O(n1*n2)
    //space:    O(n1+n2)
    public String multiply(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int[] res = new int[num1.length()+num2.length()];
        for (int i=num1.length()-1;i>=0;--i){
            for (int j=num2.length()-1;j>=0;--j){
                int product = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum = product+res[i+j+1];
                res[i+j] += sum/10;
                res[i+j+1] = sum%10;
            }
        }
        for (int x:res){
            if(sb.length()==0&&x==0) continue;
            sb.append(x);
        }
        return sb.length()==0?"0":sb.toString();
    }

}
