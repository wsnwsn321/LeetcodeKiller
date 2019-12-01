package com.company;

import java.util.*;

public class Solution394_DecodeString {
    public static void main(String[] args) {

    }
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<StringBuilder> strings = new Stack<>();
        int num = 0;
        StringBuilder cur = new StringBuilder();
        for (char ch:s.toCharArray()){
            if (Character.isDigit(ch)){
                num = num*10+ch-'0';
            }
            else if (ch=='['){
                nums.push(num);
                num = 0;
                strings.push(cur);
                cur = new StringBuilder();
            }
            else if (ch==']'){
                int times= nums.pop();
                StringBuilder temp = cur;
                cur = strings.pop();
                for (int i=0;i<times;++i){
                    cur.append(temp);
                }
            }
            else cur.append(ch);
        }
        return cur.toString();
    }
}
