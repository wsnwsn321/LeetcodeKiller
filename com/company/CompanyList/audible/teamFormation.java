package com.company.CompanyList.audible;

import java.util.*;

public class teamFormation {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(17);l.add(12);l.add(10);l.add(2);l.add(7);l.add(2);l.add(11);l.add(20);l.add(8);
        //l.add(6);l.add(18);l.add(8);l.add(14);l.add(10);l.add(12);l.add(18);l.add(9);
        //l.add(18);l.add(5);l.add(15);l.add(18);l.add(11);l.add(15);l.add(9);l.add(7);
        getMember(l,3,4);
    }

    public static int getMember(List<Integer> emp,int team, int m){
        List<Integer> res = new ArrayList<>();
        boolean[] used = new boolean[emp.size()];
        int frontIndex=m,backIndex = emp.size()-1-m;
        PriorityQueue<Integer> frontP = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        PriorityQueue<Integer> backP = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i=0;i<m;++i){
            frontP.add(emp.get(i));
            backP.add(emp.get(emp.size()-1-i));
            used[i]=true;
            used[emp.size()-1-i] = true;
        }
        while (res.size()<team){
            int fMax = frontP.size()>0?frontP.peek():Integer.MIN_VALUE;
            int bMax = backP.size()>0?backP.peek():Integer.MIN_VALUE;
            if (fMax>bMax){
                res.add(frontP.poll());
                if (frontIndex<=backIndex)  frontP.add(emp.get(frontIndex++));
            }else {
                res.add(backP.poll());
                if (backIndex>=frontIndex) backP.add(emp.get(backIndex--));
            }
        }
        int total=0;
        for (int x: res) total+=x;
        return total;
    }
}
