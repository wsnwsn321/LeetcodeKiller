package com.company.Quora;

import java.util.HashMap;
import java.util.Map;

public class inbetweenFrequency {
    public static void main(String[] args) {

    }
    public int solution(int[] arr, int[][] matrix){
        Map<Integer,int[]> map  = new HashMap<>();
        int count=0;
        for (int[] x:matrix){
            for (int i=x[0];i<=x[1];++i){
                if (arr[i]==x[2]) count++;
            }
        }
        return count;
    }
}
