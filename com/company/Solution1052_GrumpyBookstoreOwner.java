package com.company;

public class Solution1052_GrumpyBookstoreOwner {
    public static void main(String[] args) {

    }
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int baseSatisfy=0;
        int mostUnsatisfy=0;
        int windowUnsatisfy=0;
        for (int i=0;i<customers.length;++i){
            if (grumpy[i]==0)
                baseSatisfy+=customers[i];
            windowUnsatisfy+=grumpy[i]*customers[i];
            if (i>=X){
                windowUnsatisfy-=grumpy[i-X]*customers[i-X];
            }
            mostUnsatisfy = Math.max(mostUnsatisfy,windowUnsatisfy);
        }
        return baseSatisfy+mostUnsatisfy;
    }
}
