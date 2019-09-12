package com.company;

public class googleOA1 {
    public static void main(String[] args) {
        int[] a = new int[]{-1, 0, 4, 2, 1};
        int D =3;
        solution(D,a);

    }
    public static int[] solution(int D, int[] A) {
            // write your code in Java SE 8
            int[] result = new int[A.length];
            for(int i=0;i<A.length;++i){
                int count=0;
                int temp = A[i];
                int r=0;
                while(temp!=-1&&count<D){
                    r =temp;
                    temp = A[temp];
                    count++;
                }
                if(count==D) result[i] = r;
                else result[i] = -1;
            }
            return result;
        }


}
