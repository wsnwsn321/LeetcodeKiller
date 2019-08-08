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
        if (n == 1) return Collections.singletonList(0);

        List<Set<Integer>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) adj.add(new HashSet<>());
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            if (adj.get(i).size() == 1) leaves.add(i);

        while (n > 2) {
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for (int i : leaves) {
                int j = adj.get(i).iterator().next();
                adj.get(j).remove(i);
                if (adj.get(j).size() == 1) newLeaves.add(j);
            }
            leaves = newLeaves;
        }
        return leaves;

    }
}
