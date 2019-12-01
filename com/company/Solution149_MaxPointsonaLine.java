package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution149_MaxPointsonaLine {
    public static void main(String[] args) {
        int[][] p = new int[][]{{1,4},{2,3},{0,5}};
        System.out.println(findGCD(15,20));
        System.out.println(findGCD(-15,20));
        System.out.println(findGCD(15,-20));
        System.out.println(findGCD(-15,-20));



        maxPoints(p);
    }
    public static int maxPoints(int[][] points) {
        if (points.length==0) return 0;
        int res =0;
        for (int i=0;i<points.length;++i){
            int sameP=0;
            int curMax =0;
            Map<String, Integer> count = new HashMap<>();
            for (int j=i+1;j<points.length;++j){
                int x = points[i][0] - points[j][0];
                int y = points[i][1] - points[j][1];
                if (x==y&&x==0){
                    sameP++;
                    continue;
                }
                int gcd = findGCD(x,y);
                if (gcd!=0){
                    x/=gcd;
                    y/=gcd;
                }
                String slope = x+"/"+y;
                count.put(slope,count.getOrDefault(slope,0)+1);
                curMax = Math.max(curMax,count.get(slope));
            }
            res = Math.max(res,curMax+sameP+1);
        }
        return res;
    }
    private static int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
}
