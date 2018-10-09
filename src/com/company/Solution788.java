package com.company;

public class Solution788 {
    public static void main(String[] args) {

    }
    public static int rotatedDigits(int N) {
        int count=0;
        for(int i=1;i<N+1;i++){
            String n = Integer.toString(i);
            if(n.indexOf('3')==-1&&n.indexOf('4')==-1&&n.indexOf('7')==-1){
                if(n.indexOf('2')!=-1||n.indexOf('5')!=-1||n.indexOf('6')!=-1||n.indexOf('9')!=-1) ++count;
            }
        }
        return count;
    }

}
