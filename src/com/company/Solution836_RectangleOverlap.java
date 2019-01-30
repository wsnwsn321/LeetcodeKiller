package com.company;

public class Solution836_RectangleOverlap {
    public static void main(String[] args) {

    }
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int r1Left =  rec1[0];
        int r1Right =rec1[2];
        int r1Bottom =rec1[1];
        int r1Up = rec1[3];
        int r2Left =  rec2[0];
        int r2Right =rec2[2];
        int r2Bottom =rec2[2];
        int r2Up = rec2[3];
        return !(r1Right<r2Left||r1Left>r2Right||r1Bottom>r2Up||r1Up<r2Bottom);

    }
}
