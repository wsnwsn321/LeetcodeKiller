package com.company;

import java.util.*;

public class Solution787_CheapestFlightsWithinKStops {
    public static void main(String[] args) {

    }
//    int ans = Integer.MAX_VALUE;
//    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
//        Map<Integer, List<int[]>> routes = new HashMap<>();
//        for (int[] r:flights){
//            if(!routes.containsKey(r[0])){
//                routes.put(r[0],new ArrayList<>());
//            }
//            routes.get(r[0]).add(new int[]{r[1],r[2]});
//        }
//        boolean[] visited = new boolean[n];
//        dfs(src,dst,routes,0,K,visited);
//        return ans==Integer.MAX_VALUE?-1:ans;
//
//    }
//    public void dfs(int s,int t,Map<Integer,List<int[]>> m,int cost, int k, boolean[] visited){
//        if(k+1<0) return;
//        if (s==t) {
//            ans = cost; return;
//        }
//        visited[s] = true;
//        if(!m.containsKey(s)) return;
//        List<int[]> adj = m.get(s);
//        for(int i=0;i<adj.size();++i){
//            if(visited[adj.get(i)[0]]==false){
//                if(cost+adj.get(i)[1]>ans) continue;
//                dfs(adj.get(i)[0],t,m,cost+adj.get(i)[1],k-1,visited);
//            }
//
//        }
//        visited[s] = false;
//    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int[][] dp = new int[K+2][n];
        for(int[] t:dp){
            Arrays.fill(t,1000000);
        }
        dp[0][src]=0;
        for(int i=1;i<K+2;++i){
            dp[i][src]=0;
            for (int[] route:flights){
                dp[i][route[1]] = Math.min(dp[i][route[1]],dp[i-1][route[0]]+route[2]);
            }
        }
        return dp[K+1][dst]>=1000000?-1:dp[K+1][dst];
    }
}
