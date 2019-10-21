package com.company.Google;

import java.lang.reflect.Array;
import java.util.*;

public class possibleMatrix {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();

        x.add("1,l,2");
        x.add("3,l,1");
        x.add("2,r,0");
        x.add("0,r,4");
        x.add("1,u,3");
        x.add("0,b,2");
        x.add("0,u,4");
        x.add("4,u,1");
        int[][] res = matrix(x,5);
        for (int i=0;i<res.length;++i){
            for (int j=0;j<res[0].length;++j){
                System.out.print(res[i][j]+",");
            }
            System.out.println();
        }
    }
    public static int[][] matrix(List<String> relations,int n){
        int[] leftRight = new int[n];
        int[] upDown = new int[n];
        List<int[]> horizontal = new ArrayList<>();
        List<int[]> vertical = new ArrayList<>();

        for (String x:relations){
            String[] position = x.split(",");
            if (position[1].equals("l")){
                horizontal.add(new int[]{Integer.parseInt(position[0]),Integer.parseInt(position[2])});
                leftRight[Integer.parseInt(position[2])]++;
            }
            else if (position[1].equals("r")){
                horizontal.add(new int[]{Integer.parseInt(position[0]),Integer.parseInt(position[2])});
                leftRight[Integer.parseInt(position[2])]++;
            }
            else if (position[1].equals("u")){
                vertical.add(new int[]{Integer.parseInt(position[0]),Integer.parseInt(position[2])});
                upDown[Integer.parseInt(position[2])]++;
            }
            else if (position[1].equals("b")){
                vertical.add(new int[]{Integer.parseInt(position[2]),Integer.parseInt(position[0])});
                upDown[Integer.parseInt(position[0])]++;
            }
        }
        Queue<Integer> q= new LinkedList<>();
        int[] hRank = new int[n];
        int[] vRank = new int[n];
        for (int i=0;i<leftRight.length;++i){
            if (leftRight[i]==0)
                q.offer(i);
        }
        int index=0;
        while (q.size()>0){
            int cur = q.poll();
            hRank[index++] = cur;
            for (int[] x: horizontal){
                if (x[0]==cur){
                    leftRight[x[1]]--;
                    if (leftRight[x[1]]==0)
                        q.offer(x[1]);
                }
            }
        }
        q.clear();
        for (int i=0;i<leftRight.length;++i){
            if (upDown[i]==0)
                q.offer(i);
        }
        index=0;
        while (q.size()>0){
            int cur = q.poll();
            vRank[index++] = cur;
            for (int[] x: vertical){
                if (x[0]==cur){
                    upDown[x[1]]--;
                    if (upDown[x[1]]==0)
                        q.offer(x[1]);
                }
            }
        }
        int[][] res= new int[n][n];
        for (int[] x:res) Arrays.fill(x,-1);
        for (int i=0;i<hRank.length;++i){
            res[0][i] = hRank[i];
        }
        int height=0;
        for (int i=0;i<vRank.length;++i){
            for (int j=0;j<res[0].length;++j){
                if (res[0][j]==vRank[i]){
                    res[0][j] = -1;
                    res[height++][j]=vRank[i];
                    break;
                }
            }
        }
        return res;

    }
}

