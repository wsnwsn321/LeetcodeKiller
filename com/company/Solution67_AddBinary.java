package com.company;

public class Solution67_AddBinary {
    public static void main(String[] args) {

    }
    //time:     O(n) n=max(a,b)
    //space:    O(n)
    public String addBinary(String a, String b) {
        String result = "";
        int i=a.length()-1;
        int j =b.length()-1;
        int up=0;
        while (i>=0||j>=0){
            int aNum = i>=0?a.charAt(i)-'0':0;
            int bNum = j>=0?b.charAt(j)-'0':0;
            int sum = aNum+bNum+up;
            up = sum/2;
            result=(sum%2)+result;
            i--;j--;
        }
        if (up>0) result="1"+result;
        return result;
    }
}
