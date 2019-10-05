package com.company.Google;

public class waterPlants {
    public static void main(String[] args) {
        int[] p = new int[]{2};
        int a =solution(p,5,7);
        int b = waterPlants(p,5,7);
        int x=1;
    }
    public static int solution(int[] plants, int cap1, int cap2){
        int l=0,r = plants.length-1;
        int lcur = 0,rcur = 0;
        int res =0;
        while (l<r){
            if (lcur>=plants[l]) {
                lcur-=plants[l];
                l++;
            }
            else {
                res++;
                lcur=cap1-plants[l];
                l++;
            }
            if (rcur>=plants[r]) {
                rcur-=plants[r];
                r--;
            }
            else {
                res++;
                rcur=cap2-plants[r];
                r--;
            }
        }
        if (l==r){
            res+=(lcur+rcur)>=plants[l]?0:1;
        }
        return res;
    }

    public static int waterPlants(int[] plants, int cap1, int cap2) {
        // input validation not needed

        int can1 = 0;
        int can2 = 0;
        int lo = 0;
        int hi = plants.length - 1;
        int numRefils = 0;

        while (lo < hi) {
            if (can1 < plants[lo]) {
                can1 = cap1;
                ++numRefils;
            }
            if (can2 < plants[hi]) {
                can2 = cap2;
                ++numRefils;
            }

            can1 -= plants[lo++];
            can2 -= plants[hi--];
        }

        if (lo == hi && (plants[lo] > can1 + can2)) {
            return ++numRefils;
        } else {
            return numRefils;
        }
    }
}
