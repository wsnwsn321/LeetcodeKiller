package com.company.CompanyList.Amazon;

import java.util.Collections;

public class AmazonDebug01_DistinctCount {
    public static void main(String[] args) {
        int[] a = new int[]{2,2,2,2,2};
        distinctElementsCount(5,a);
    }
   static int distinctElementsCount(int size, int[] elements){
        int[] counted =new int[size];
        counted[0] = elements[0];
        int count,flag;
        count=1;
        for(int i=0;i<size;i++){
            flag=0;
            for(int j=0;j<count;j++){
                if(elements[i]==counted[j]){
                    flag=1;

                }

            }
            if(flag==0){
                count++;
                counted[count-1]=elements[i];
            }

        }
        return count;
    }
}
