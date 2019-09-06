package com.company.goldmansachs;

import java.util.*;

public class StrangeSorting {
    public static void main(String[] args) {
        int[] m=new int[]{3,5,4,6,2,7,9,8,0,1};
        String[] nums = new String[]{"990","332","32"};
        StrangeSorting(m,nums);
    }
    public static String[] StrangeSorting(int[] map, String[] nums){
        Map<Character,Character> m =new HashMap<>();
        Map<String,Integer> StringtoReal =new HashMap<>();
        for (int i=0;i<map.length;++i){
            m.put((char)(map[i]+'0'),(char)(i+'0'));
        }
        String[] r = new String[nums.length];
        for (int i=0;i<nums.length;++i){
            char[] cx = nums[i].toCharArray();
            StringBuilder n = new StringBuilder();
            for (char c:cx){
                n.append(m.get(c));
            }
            int realNum = Integer.parseInt(n.toString());
            StringtoReal.put(nums[i],realNum);
        }
        PriorityQueue<String> p = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer n1 = StringtoReal.get(o1);
                Integer n2 = StringtoReal.get(o2);
                return n1.compareTo(n2);
            }
        });
        for (String x:nums){
            p.add(x);
        }
        for (int i=0;i<nums.length;++i){
            r[i]=p.poll();
        }
        return r;

    }
}
