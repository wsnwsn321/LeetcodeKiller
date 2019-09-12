package com.company;

public class Solution67_AddBinary {
    public static void main(String[] args) {

    }
    public String addBinary(String a, String b) {
        int l1 = a.length()-1,l2 = b.length()-1;
        String result = "";
        int carry=0;
        while(l1>=0&&l2>=0){
            int n1 = a.charAt(l1)-'0';
            int n2 = b.charAt(l2)-'0';
            int sum = n1+n2+carry;
            carry = sum/2;
            result=(char)(sum%2+'0')+result;
            l1--;l2--;
        }
        while(l1>=0){
            int sum = a.charAt(l1)-'0'+carry;
            carry =sum/2;
            result=(char)(sum%2+'0')+result;
            l1--;
        }
        while(l2>=0){
            int sum = a.charAt(l2)-'0'+carry;
            carry =sum/2;
            result=(char)(sum%2+'0')+result;
            l2--;
        }
        if(carry==1) result='1'+result;
        return result;
    }
}
