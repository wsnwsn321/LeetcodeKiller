package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Solution884_UncommonWordsfromTwoSentences {
    public static void main(String[] args) {
        String a ="fv kisxg hfmeq fw gi fpyc ojtr s hfmeq ojtr kisxg";
        String b = "chpi hfmeq chpi dq hwtxa orql orql m s fw dq m fw";
        //String[] r = uncommonFromSentences(a,b);

    }
    public  String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> count = new HashMap();
        for (String word: A.split(" "))
            count.put(word, count.getOrDefault(word, 0) + 1);
        for (String word: B.split(" "))
            count.put(word, count.getOrDefault(word, 0) + 1);

        List<String> ans = new LinkedList();
        for (String word: count.keySet())
            if (count.get(word) == 1)
                ans.add(word);

        return ans.toArray(new String[ans.size()]);
    }



}
