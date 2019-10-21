package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution528_RandomPickwithWeight {
    public static void main(String[] args) {

    }
    class Solution {
        List<Integer> psum = new ArrayList<>();
        int total = 0;
        Random rand = new Random();
        public Solution(int[] w) {
            for (int x:w){
                total+=x;
                psum.add(total);
            }
        }

        public int pickIndex() {
            int target = rand.nextInt(total);
            int l =0,r = psum.size()-1;
            while (l<r){
                int mid = (l+r)/2;
                if (target==psum.get(mid)) return mid;
                else if (target>psum.get(mid)) l = mid+1;
                else r=mid-1;
            }
            return l;
        }
    }

}
