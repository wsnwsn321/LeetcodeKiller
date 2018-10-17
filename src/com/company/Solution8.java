package com.company;

public class Solution8 {
    public static void main(String[] args) {

        String s = "    ";
        myAtoi(s);

    }
    public static int myAtoi(String str) {
        String result = "";
        if(str.length()==0) return 0;
        while(str.charAt(0)==' '){
            str = str.substring(1,str.length());
            if(str.length()==0) return 0;
        }
        if(str.length()==0) return 0;
        int i=0;
        while(i<str.length()&&str.charAt(i)!=' '){
            result+=str.charAt(i++);
        }
        char sign=' ';
        if(result.charAt(0)=='-'||result.charAt(0)=='+'){
            sign = result.charAt(0);
            result =result.substring(1);
        }
        if(result.length()==0||result.charAt(0)<48||result.charAt(0)>57) return 0;
        for(int j=0;j<result.length();++j){
            if(result.charAt(j)<48||result.charAt(j)>57){
                result = result.substring(0,j);
                break;
            }
        }
        int r =checkInt(result,sign);
        return r;

    }
    public static int checkInt(String s,char sign){
        int r =0;
        try {
            if(sign=='-') r=-Integer.parseInt(s);
            else r = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            if(sign=='-') r= Integer.MIN_VALUE;
            else r = Integer.MAX_VALUE;
        }
        return r;
    }
}
