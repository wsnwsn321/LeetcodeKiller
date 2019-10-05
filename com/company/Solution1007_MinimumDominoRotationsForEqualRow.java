package com.company;

public class Solution1007_MinimumDominoRotationsForEqualRow {
    public static void main(String[] args) {

    }
    public int minDominoRotations(int[] A, int[] B) {
        int countA=0,countB=0;
        int i=0,j=0;
        while (i<A.length&&(A[i] == A[0] || B[i] == A[0])){
            if (A[i]!=A[0]) countA++;
            if (B[i]!=A[0]) countB++;
            if (i==A.length-1) return Math.min(countA,countB);
            i++;
        }
        countA =0;countB=0;
        while (j<B.length&&(A[j] == B[0] || B[j] == B[0])){
            if (A[j]!=B[0]) countA++;
            if (B[j]!=B[0]) countB++;
            if (j==B.length-1) return Math.min(countA,countB);
            j++;
        }
        return -1;
    }
}
