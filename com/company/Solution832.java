package com.company;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.*;

public class Solution832 {
    public static void main(String[] args) {
    int[][] A = new int[][]{{1,1, 0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
    A=flipAndInvertImage(A);
    System.out.print(A);


    }
    public static int[][] flipAndInvertImage(int[][] A) {
        for(int i =0;i<A.length;i++){
            int[] B = A[i];
            for(int j=0;j<B.length/2;j++){
                int temp = B[j];
                B[j] = 1-B[B.length-1-j];
                B[B.length-1-j] =1- temp;
            }
            if(B.length%2!=0){
                B[B.length/2] = 1-B[B.length/2];
            }
            A[i] = B;
        }
        return A;

    }
}
