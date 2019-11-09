package com.company.CompanyList.citrix;

import java.util.PriorityQueue;
import java.util.Stack;

public class ClimbTheHill {
    public static void main(String[] args) {
        int[] i= new int[]{3,1,2,1};
        climbHill(i);
    }
    public static int climbHill(int[] slope){
        Stack<Integer> s = new Stack<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int increaseChange=0;
        int decreaseChange=0;
        //make array decrease
        for (int i = 0; i < slope.length; i++)
        {
            if (!pq.isEmpty() && pq.element() < slope[i])
            {
                decreaseChange += slope[i] - pq.peek();
                pq.remove();
                pq.add(slope[i]);
            }
            pq.add(slope[i]);
        }
        pq = new PriorityQueue<>();
        //make array increase
        for (int i=0;i<slope.length;++i){
            if (!pq.isEmpty() && pq.element() > slope[i])
            {
                increaseChange +=  pq.peek() - slope[i];
                //pq.remove();
                pq.add(slope[i]);
            }
            pq.add(slope[i]);
        }
        return Math.min(increaseChange,decreaseChange);
    }
}
