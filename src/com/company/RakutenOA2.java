package com.company;

public class RakutenOA2 {
    public static void main(String[] args) {
    //int A[] = new int[]{1,1,2,4,5};
       int A[] = new int[]{1,1,3,3,3,4,5,5,5,5};
    int k =2;
    solution(A,k);
    }
    public static int solution(int[] A, int K) {
        int n = A.length;
        int best = 0;
        int count = 1;
        for (int i = 0; i < n - 1-K; i++) {
            if (A[i] == A[i + 1])
                count = count + 1;
            else
                count = 1;
            if (count > best)
                best = count;
        }
        int result = Math.min(best +K,A.length);

        return result;
    }
}
