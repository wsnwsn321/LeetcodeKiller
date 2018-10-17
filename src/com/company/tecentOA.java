package com.company;

import java.util.Scanner;

public class tecentOA {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int count = countKNumOf1Substrings(n,s);
            System.out.println(count);

    }
    public static int countKNumOf1Substrings(int k,String s) {
        int count=0;
        char[] cs = s.toCharArray();
        int i=0;
        while(i<cs.length){
            if(checkNumOf1(k,i,cs)) count++;
            i++;
        }
        return count;
    }

    public static boolean checkNumOf1(int k, int p,char[] cs) {
        int count=0;
        if(p>cs.length-1){
            return false;
        }
        for(int i=p;i<cs.length;++i){
            if(cs[i]=='1') count++;
            if(count==k) return true;
        }
        return false;

    }
}
