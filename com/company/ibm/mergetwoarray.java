package com.company.ibm;

public class mergetwoarray {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        int[] b = new int[]{2,5,5};
        merge(a,b);
    }
    public static int[] merge(int[] a,int[] b ){
        int al = a.length;
        int bl = b.length;
        int[] res = new int[al+bl];
        int i=0,j=0,k=0;
        while (i<al||j<bl){
            int a_num = i<al?a[i]:Integer.MAX_VALUE;
            int b_num = j<bl?b[j]:Integer.MAX_VALUE;
            if (a_num>b_num) {
                res[k++]=b_num;
                j++;
            }
            else {
                res[k++]=a_num;
                i++;
            }
        }
        return res;
    }
}
