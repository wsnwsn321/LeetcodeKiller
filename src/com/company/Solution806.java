package com.company;

public class Solution806 {
    public static void main(String[] args) {
        int[] width = new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        numberOfLines(width,s);
    }
    public static int[] numberOfLines(int[] widths, String S) {
        int[] result = new int[2];
        int totalLength=0;
        for(int i=0;i<S.length();i++){
            int singleWordLength = widths[S.charAt(i)-97];
            if(totalLength%100>90&&totalLength%100+singleWordLength>100){
                totalLength+=(100-totalLength%100)+singleWordLength;
            }
            else{
                totalLength+=singleWordLength;
            }
        }
        result[0]= totalLength/100;
        result[1]=totalLength%100;
        if(result[1]>0){
            result[0]++;
        }
        return result;
    }

}
