package com.company.purestorage;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LockUserAnalyzer {
    public static void main(String[] args) {
        List<String> res = new ArrayList<>();
        res.add("ACQUIRE 364");
        res.add("ACQUIRE 84");
        res.add("RELEASE 364");
        res.add("RELEASE 84");
        analyzeLock(res);
    }
    public static int analyzeLock(List<String> input){
        List<Integer> acNum = new ArrayList();
        Stack<Integer> s = new Stack<>();
        for (int i=0;i<input.size();++i){
            String cur = input.get(i);
            String[] cand = cur.split("\\s+");
            if (cand[0].equals("ACQUIRE"))
                acNum.add(Integer.parseInt(cand[1]));
            else{
                int pId = Integer.parseInt(cand[1]);
                if (pId!=acNum.get(acNum.size()-1)||!acNum.contains(pId))
                    return i+1;
                else {
                    acNum.remove(acNum.size()-1);
                }
            }
        }


        return acNum.size()==0?0:input.size()+1;
    }
}
