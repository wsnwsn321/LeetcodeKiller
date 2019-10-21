package com.company.Amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpAndDowns {
    public static void main(String[] args) {
        List<Integer> i = new ArrayList(Arrays.asList(1,10,23,18,15,20));
        solution(i);
    }
    public static List<String> solution(List<Integer> input){
        List<String> res = new ArrayList<>();
        boolean up = false,down=false;
        res.add(String.valueOf(input.get(0)));
        for (int i=1;i<input.size();++i){
            int cur = input.get(i);
            int pre = input.get(i-1);
            if (cur>pre) {
                up = true;
                if (down) {
                    res.add("UP");
                    down = false;
                    res.add(String.valueOf(input.get(i)));
                } else {
                    res.add(String.valueOf(input.get(i)));
                }
            }
            else if (cur<pre) {
                down = true;
                if (up) {
                    res.add("DOWN");
                    up = false;
                    res.add(String.valueOf(input.get(i)));
                } else {
                    res.add(String.valueOf(input.get(i)));
                }
            }
        }
        return res;
    }
}
