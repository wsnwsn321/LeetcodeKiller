package com.company.CompanyList.pocketGem;

public class PocketGemOA1 {
    public static void main(String[] args) {
    int[] a =new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
    solution(a);
    }
    public static int solution(int[] A) {
        int max = A[0];
        int[] sum = new int[A.length];
        sum[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            sum[i] = Math.max(A[i], sum[i - 1] + A[i]);
            max = Math.max(max, sum[i]);
        }

        return max;
    }
}
