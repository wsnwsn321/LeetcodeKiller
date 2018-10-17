package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tecentOA2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List arr = new ArrayList();
        int i=0;
        int a = in.nextInt();
        while (in.hasNextInt())
        {
            arr.add(in.nextInt());
        }

        for(int k =0;k<arr.size();k++){
            System.out.print(arr.get(k)+",");
        }

    }

    public static int longest(int n, int[] s){
        int max =0;
        for(int i =0;i<s.length;i++){
            for(int j=s.length;j>0;--j){
                int count = findCurrentlongest(n,s,i,j);
                max = Math.max(max,count);
            }

        }
        return max;

    }
    public static int findCurrentlongest(int n, int[] s, int start, int end){
        int count=0;
        for(int i =start;i<end;i++){
            if(s[i]%5==0) count++;
        }
        if(count>=(double)(end-start)/2) return end-start;
        else{
            return 0;
        }

    }

}
