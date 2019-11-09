package com.company.CompanyList;

import java.util.*;

public class MicrosoftVO {
    public static void main(String[] args) {
//        List<Integer> l = new ArrayList<>();
//        for(int i=0;i<3;++i){
//            l.add(i*i);
//            l.add(i*i);
//        }
//        l.add(-1);
//        l.add(-1);
//        l.add(4);
//        l.add(5);
//        List<List<int[]>> res = connectedPoints(l,3);
//        int[] a = {5,7,8};
//        int[] b = {6,3,4};
//        int[] c = {1,2,10};
//        int[][] map = new int[][]{a,b,c};
        String s1  = "a";
        String s2 = "";
        Set<String> s  = FindSubString(s1,s2);
        int i=s.size();
    }

    public static List<List<int[]>> connectedPoints(List<Integer> p,int D){
        List<int[]> points = new ArrayList<>();
        for(int i=0;i<p.size();i=i+2){
            int[] position = new int[2];
            position[0] = p.get(i);
            position[1] =p.get(i+1);
            points.add(position);
        }
        List<List<int[]>> res = new ArrayList<>();
        for(int i=0;i<points.size();++i){
            List<int[]> temp = new ArrayList<>();
            temp.add(points.get(i));
            DFS(i,points.get(i),points,temp,D,res);
            if(temp.size()>1) res.add(temp);
        }
        return res;
    }
    public static void DFS(int i,int[] p, List<int[]> points, List<int[]> temp,int D, List<List<int[]>> res){
        if(i==points.size()-1) return;
        for(int j=i+1;j<points.size();++j){
            int[] x = points.get(j);
            int dis = (p[0]-x[0])*(p[0]-x[0])+(p[1]-x[1])*(p[1]-x[1]);
            if(dis<=D){
                temp.add(x);
                DFS(j,x,points,temp,D,res);
            }
        }

    }

    public static int longestPath(int[][] map){
        int max =0;
        for(int i=0;i<map.length;++i) {
            for (int j = 0; j < map[0].length; ++j) {
                int count = DFS(map, i, j);
                max = Math.max(count, max);
            }
        }
        return max;

    }
    public static int DFS(int[][]map,int i, int j ){
        if(i<0||i>map.length-1||j<0||j>map[0].length-1)
            return 0;
        int count =1;
        if(j-1>=0&&map[i][j-1]<map[i][j])
            count= 1+DFS(map,i,j-1);
        if(i-1>-1&&map[i-1][j]<map[i][j]){
            count= 1+DFS(map,i-1,j);
        }
        if(i+1<map.length&&map[i+1][j]<map[i][j]){
            count= 1+DFS(map,i+1,j);
        }
        if(j+1<map[0].length&&map[i][j+1]<map[i][j]){
            count= 1+DFS(map,i,j+1);
        }
        return count;

    }


    public static Set<String> FindSubString(String s1, String s2){
        Set<String> res = new HashSet<>();
        if(s1.equals("")||s2.equals("")) return res;
        for(int i=0;i<s1.length();++i){
            res.add(s1.substring(i,i+1));
        }
        for(int i=0;i<s1.length();++i){
            for(int j=i+1;j<s1.length()+1;++j){
                String candidate = s1.substring(i,j);
                if(res.contains(candidate)) continue;
                if(ifSub(candidate,s2)) res.add(candidate);
            }
        }
        return res;

    }
    public static boolean ifSub(String s1sub,String s2){
        int diff =0;
        if(s1sub.length()>s2.length()) return false;
        for(int i=0;i<s2.length();++i){
            int count=0;
            if(s1sub.length()>s2.substring(i).length()) return false;
            for(int j=i;j<s2.length();++j){
                if(count<s1sub.length()){
                    if(s1sub.charAt(count)!=s2.charAt(j)){
                        diff++;
                        if(diff>=2) break;
                    }
                    count++;
                }
                else{
                    break;
                }
            }
            if(diff<=1) return true;
            diff = 0;
        }
        return false;
    }
}
