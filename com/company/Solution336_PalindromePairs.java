package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.InflaterInputStream;

public class Solution336_PalindromePairs {
    public static void main(String[] args) {

    }
    /**
     * Step 1: store every word with its index into a hash map.
     * Step 2: For each word in the array, split into two parts str1 and str2. Check whether str1 and str2 is palindrome
     * If str1 is palindrome, we can use str1 as middle part, str2 as right part, and find if map contains reversed str2.
     * If contains, then we can use that string as left part, combine with middle part, right part, it will form a correct
     * palindrome string.
     * Step 3: do all same operations for str2 (set str2 as middle part)
     * */
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        if (words.length == 0) {
            return result;
        }

        // step1
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j <= words[i].length(); j++) {
                String str1 = words[i].substring(0, j);
                String str2 = words[i].substring(j);
                if (isPalindrome(str1)) {
                    String reverseStr2 = new StringBuilder(str2).reverse().toString();
                    if (map.containsKey(reverseStr2) && map.get(reverseStr2) != i) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(map.get(reverseStr2));
                        temp.add(i);
                        result.add(temp);
                    }

                }
                if (isPalindrome(str2)) {
                    String reverseStr1 = new StringBuilder(str1).reverse().toString();
                    if (map.get(reverseStr1).equals(reverseStr1) && map.get(reverseStr1) != i && str2.length() != 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(i);
                        temp.add(map.get(reverseStr1));
                        result.add(temp);
                    }
                }
            }
        }
        return result;
    }
    public boolean isPalindrome(String w){
        int l=0, r = w.length()-1;
        while (l<r){
            if (w.charAt(l)!=w.charAt(r)) return false;
            l++;r--;
        }
        return true;
    }
}
