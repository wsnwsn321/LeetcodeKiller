package com.company.imc;

public class Battleship {
    public static void main(String[] args) {
        String x = "1A 1A";
        String s = "";
        artifact(12,x,s);
    }

    public static int[] artifact(int N, String artifacts, String searched){
        int [] foundArti = new int[N+1];
        int [] totalArti = new int[N+1];
        String[] parts = artifacts.split(",");
        int[][] grid = new int[N][N];
        for (int i=0;i<parts.length;++i) {
            String[] coords = parts[i].split("\\s+");
            int x1=0,x2=0,y1=0,y2=0;
            if(coords[0].length()>2){
                x1 = Integer.parseInt(coords[0].substring(0,2))-1;
                y1 = coords[0].charAt(2) - 'A';
            }
            else{
                x1 = coords[0].charAt(0) - '1';
                y1 = coords[0].charAt(1) - 'A';
            }
            if(coords[1].length()>2){
                x2 = Integer.parseInt(coords[1].substring(0,2))-1;
                y2 = coords[1].charAt(2) - 'A';
            }
            else{
                x2 = coords[1].charAt(0) - '1';
                y2 = coords[1].charAt(1) - 'A';
            }
            for (int l=x1;l<=x2;++l){
                for (int r=y1;r<=y2;++r){
                    grid[l][r]=i+1;
                    totalArti[i+1]++;
                }
            }

        }
        String[] explored =searched.split("\\s+");
        for (String pos:explored){
            int x=0,y=0;
            if(pos.length()>2){
                x = Integer.parseInt(pos.substring(0,2))-1;
                y = pos.charAt(2) - 'A';
            }
            else{
                x = pos.charAt(0) - '1';
                y = pos.charAt(1) - 'A';
            }
            if (grid[x][y]>0){
                foundArti[grid[x][y]]++;
            }
        }
        int[] res = new int[2];
        for (int i=0;i<foundArti.length;++i){
            if (foundArti[i]==0) continue;
            if (foundArti[i]==totalArti[i]) res[0]++;
            else res[1]++;
        }
        return res;
    }


}
