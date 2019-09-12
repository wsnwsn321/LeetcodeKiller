//package com.company;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Solution394_DecodeString {
//    public static void main(String[] args) {
//
//    }
//    public String decodeString(String s) {
//        char[] cs = s.toCharArray();
//        List<Integer> front= new ArrayList<>();
//        List<Integer> back= new ArrayList<>();
//        List<int[]> pairs = new ArrayList<>();
//        for (int i=0;i<cs.length;++i){
//            if (cs[i]=='[') front.add(i);
//            if (cs[i]==']') pairs.add(new int[]{front.remove(front.size()),i});
//        }
//        for (int[] brackets:pairs){
//            int times = s.charAt(brackets[0]-1)-'0';
//            String temp = s.substring(brackets[0]+1,brackets[1]);
//            StringBuilder sb = new StringBuilder(s);
//            for (int i=0;i<times;++i){
//                sb.append(temp);
//            }
//        }
//        for (int i=0;i<s.length();++i){
//            char c = s.charAt(i);
//            if (c=='['||c==']'||(c-'0'>=0&&c-'0'<=9)){
//
//            }
//        }
//
//    }
//}
