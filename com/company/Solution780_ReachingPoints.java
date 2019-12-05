package com.company;

public class Solution780_ReachingPoints {
    public static void main(String[] args) {

    }
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        if (sx==tx&&sy==ty)
            return true;
        if (sx>tx||sy>ty)
            return false;
        return reachingPoints(sx+sy,sy,tx,ty)||reachingPoints(sx,sx+sy,tx,ty);
    }
}
