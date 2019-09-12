package com.company;

import java.util.*;

public class Solution888 {
    public static void main(String[] args) {
        int[] A = new int[]{1,1};
        int[] B = new int[]{2,2};
        fairCandySwap(A,B);
    }

    public static int[] fairCandySwap(int[] A, int[] B) {
        int totalA=0, totalB=0;
        Set<Integer> Alist = new HashSet<>();
        for (int i : A)
        {
            Alist.add(i);
            totalA+=i;
        }
        for(int i=0;i<B.length;i++){
            totalB+=B[i];
        }
        int avg = (totalA+totalB)/2;
        int[] result = new int[2];
        for(int i=0;i<B.length;i++){
            int x = B[i];
            if((totalA+x>avg||totalA+x==avg)&&Alist.contains(totalA+x-avg)){
                result[0] = totalA+x-avg;
                result[1] = x;
                return result;
            }

        }
    return result;
    }
}
