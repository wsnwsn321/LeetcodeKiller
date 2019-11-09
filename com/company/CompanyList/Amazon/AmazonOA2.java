package com.company.CompanyList.Amazon;

import java.util.*;

public class AmazonOA2 {
    public static void main(String[] args) {

        //String a = "";
        //substringsKDist(a,6);
        List<List<Integer>> f = new ArrayList<>();
        List<List<Integer>> back = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        List<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(4);
        List<Integer> c = new ArrayList<>();
        c.add(3);
        c.add(6);
        List<Integer> d = new ArrayList<>();
        d.add(1);
        d.add(2);
        f.add(a);
        f.add(b);
        f.add(c);
        back.add(d);

        pairSum(f,back,7);


    }
    public static List<List<Integer>> nearestXsteakHouses(int a){
        return null;
    }

    public static int bstDistance(int[] value, int n, int node1, int node2){
        return 1;
    }

    public static List<String> substringsKDist(String in, int k){
        List<String> res = new ArrayList<>();
        List<Character> dups = new ArrayList<>();
        int left=0,right=0;
        while(right<in.length()){
            int diff=0;
            while(right<in.length()&&!dups.contains(in.charAt(right))&&diff<k){
                dups.add(in.charAt(right++));
                diff++;
            }
            if(diff==k) {
                res.add(in.substring(left, right));
            }
                left++;
                right=left;
                dups.clear();
            }
        return res;
    }

    public static int minimumDistance(int rows, int columns, List<List<Integer>> area){
           int distance=0;
        Queue<int[]> q = new LinkedList<>();
        int[][] directions = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        q.add(new int[]{0,0});
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0) {
                int[] pos = q.poll();
                area.get(pos[0]).set(pos[1], 0);
                for (int[] x : directions) {
                    int row = pos[0] + x[0];
                    int column = pos[1] + x[1];
                    if (row >= 0 && row < rows && column >= 0 && column < columns && area.get(row).get(column) != 0) {
                        if (area.get(row).get(column) == 9) {
                            return distance + 1;
                        }
                        q.add(new int[]{row, column});
                    }
                }
            }
            distance++;

        }
        return -1;
    }
    public static List<Integer> windowMin(int numOfDays, List<Integer> temp, int windowSize){
        PriorityQueue<Integer> t = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        List<Integer> res = new ArrayList<>();
        int min = temp.get(0);
        for(int i=0;i<windowSize;++i){
            t.add(temp.get(i));
        }
        res.add(t.peek());
        for(int i=1;i<=temp.size()-windowSize;++i){
            t.remove(temp.get(i-1));
            t.add(temp.get(i+windowSize-1));
            res.add(t.peek());
        }
        return res;
    }

    public static List<List<Integer>> pairSum(List<List<Integer>> foregroundApp,  List<List<Integer>> backgroundApp, int deviceCap){
        List<List<Integer>> app = new ArrayList<>();
        Map<List<Integer>, Integer> m = new HashMap<>();
        Collections.sort(foregroundApp, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o2.get(1).compareTo(o1.get(1));
            }
        });
        Collections.sort(backgroundApp, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o2.get(1).compareTo(o1.get(1));
            }
        });
        int max =0;
        for(List<Integer> x: backgroundApp){
            int c = x.get(1);
            for(List<Integer> y:foregroundApp){
                int mUsed = c+y.get(1);
                if(mUsed<deviceCap&&mUsed>max){
                    max = mUsed;
                    List<Integer> pos = new ArrayList<>();
                    pos.add(x.get(0));
                    pos.add(y.get(0));
                    m.put(pos,mUsed);
                }
            }
        }
        for(Map.Entry<List<Integer>,Integer> entry: m.entrySet()){
            if(entry.getValue()==max){
                app.add(entry.getKey());
            }
        }
        return app;

    }


}

