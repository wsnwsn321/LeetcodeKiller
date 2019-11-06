package com.company;

import java.util.*;

public class Solution394_DecodeString {
    public static void main(String[] args) {

    }
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<StringBuilder> strs = new Stack<>();
        StringBuilder cur = new StringBuilder();
        int num=0;
        for (char ch:s.toCharArray()){
            if (Character.isDigit(ch)){
                num+=num*10+ch-'0';
            }
            else if (ch=='['){
                nums.push(num);
                strs.push(cur);
                cur = new StringBuilder();
                num =0;
            }
            else if (ch==']'){
                StringBuilder temp = cur;
                cur = strs.pop();
                for (int i=nums.pop();i>=0;--i)
                    cur.append(temp);
            }
            else cur.append(ch);
        }
        return cur.toString();
    }
}
