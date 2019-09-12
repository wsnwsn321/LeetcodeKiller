package com.company;

public class Solution868 {
    public static void main(String[] args) {
    int n =22;
    binaryGap(22);
    }
    public static int binaryGap(int N) {
        int start = -1, end =-1,diff =0;
        String bin = Integer.toBinaryString(N);
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'){
                if(start>=0){
                    end = i;
                    if(diff<end-start) diff = end-start;
                    start = end;
                }
                else {
                    start =i;
                }

            }
        }
        return diff;
    }
}
