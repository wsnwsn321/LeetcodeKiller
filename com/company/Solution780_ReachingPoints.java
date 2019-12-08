package com.company;

public class Solution780_ReachingPoints {
    public static void main(String[] args) {
        reachingPoints(2,5,19,12);
    }
    public static boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx > sx && ty > sy) {
            if (tx > ty)
                tx %= ty;
            else
                ty %= tx;
        }
        return
                (sx == tx && sy <= ty && (ty - sy) % sx == 0) || (sy == ty && sx <= tx && (tx - sx) % sy == 0);
    }

}
