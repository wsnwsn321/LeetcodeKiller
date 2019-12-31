package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution373_FindKPairswithSmallestSums {
    public static void main(String[] args) {

    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0)
            return res;
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return (nums1[o1.get(0)] + nums2[o1.get(1)]) - (nums1[o2.get(0)] + nums2[o2.get(1)]);
            }
        });
        for (int i = 0; i < nums1.length; ++i) {
            List<Integer> temp = new ArrayList<>();
            temp.add(i);
            temp.add(0);
            pq.offer(new ArrayList<>(temp));
        }
        while (k > 0 && pq.size() > 0) {
            List<Integer> temp = pq.poll();
            List<Integer> current = new ArrayList<>();
            current.add(nums1[temp.get(0)]);
            current.add(nums2[temp.get(1)]);
            res.add(new ArrayList<>(current));
            if (temp.get(1) < nums2.length - 1) {
                temp.set(1, temp.get(1) + 1);
                pq.offer(new ArrayList<>(temp));
            }
            k--;
        }
        return res;
    }
}
