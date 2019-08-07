package src.com.company;

import java.util.*;

public class Solution310_MinimumHeightTrees {
    public static void main(String[] args) {
        int[][] t =new int[5][2];
        t[0] = new int[]{3,0};
        t[1] = new int[]{1,3};
        t[2] = new int[]{2,3};
        t[3] = new int[]{4,3};
        t[4] = new int[]{4,5};
        findMinHeightTrees(6,t);
    }
    public static List<Integer> findMinHeightTrees(int n, int[][] edges) {
        Queue<Integer> q= new LinkedList<>();
        List<List<Integer>> e = new ArrayList<>();
        for (int i=0;i<edges.length;++i){
            e.add(new ArrayList<>());
            e.get(i).add(edges[i][0]);
            e.get(i).add(edges[i][1]);
        }
        int[][] m = new int[n][n];
        int[] length = new int[n];
        Set<Integer> visited = new HashSet<>();
        for (int i=0;i<n;++i) {
            int l = 1;
            q.add(i);
            while (!q.isEmpty()) {
                int size = q.size();
                while (size > 0) {
                    int node = q.poll();
                    for (List<Integer> edge : e) {
                        if (edge.contains(node) && !visited.contains(node)) {
                            for (Integer x : edge) {
                                if (x!=node&&!visited.contains(x)){
                                    q.add(x);
                                    m[i][x]=l;
                                    m[x][i]=l;
                                }
                            }
                        }
                    }
                    visited.add(node);
                    l++;
                    size--;
                }
            }
            visited = new HashSet<>();
        }
        int max = 0;
        for (int i=0;i<m.length;++i){
            for (int x:m[i]){
                max = Math.max(max,x);
            }
            length[i] =max;
            max=0;
        }
        int min =n;
        for (int i=0;i<length.length;++i){
            min = Math.min(min,length[i]);
        }
        List<Integer> ret = new ArrayList<>();
        for (int i=0;i<length.length;++i){
            if (length[i]==min) ret.add(i);
        }
        return ret;

    }
}
