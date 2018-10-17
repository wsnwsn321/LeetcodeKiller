package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution20_R {
    public static void main(String[] args) {

    }
    public static boolean isValid(String s) {
        List<Character> l = new ArrayList<>();
        char[] cs = s.toCharArray();
        int index =0;
        for(int i=0;i<cs.length;++i){
            char current = cs[i];
            if(current=='('||current=='['||current=='{'){
                l.add(current);
                index++;
            }
            else if(index<0) return false;
            else if((current==')'&&l.get(index-1)=='(')||(current==']'&&l.get(index-1)=='[')||(current=='}'&&l.get(index-1)=='{')){
                l.remove(index-1);
                index--;
            }
            else{
                return false;
            }

        }
        return index==0;
    }

//    public static boolean isValid(String s) {
//        if(s.length()%2!=0||s.charAt(0)==')'||s.charAt(0)==']'||s.charAt(0)=='}') return false;
//        char[] cs = s.toCharArray();
//        for(int i=0;i<cs.length;++i){
//            if(cs[i]==')'){
//                if(cs[i-1]=='{'||cs[i-1]=='[') return false;
//                if(!findFirstP(i,cs,cs[i])) return false;
//            }
//            if(cs[i]=='}'){
//                if(cs[i-1]=='('||cs[i-1]=='[') return false;
//                    if(!findFirstP(i,cs,cs[i])) return false;
//            }
//            if(cs[i]==']'){
//                if(cs[i-1]=='('||cs[i-1]=='{') return false;
//                if(!findFirstP(i,cs,cs[i])) return false;
//            }
//        }
//        return true;
//
//    }
//    public static boolean findFirstP(int p, char[] s, char c){
//        for(int i=0;i<p;++i){
//            if(c=='}'&&s[i]=='{'){
//                s[i] = 'c';
//                return true;
//            }
//            if(c==')'&&s[i]=='('){
//                s[i] = 'c';
//                return true;
//            }
//            if(c==']'&&s[i]=='['){
//                s[i] = 'c';
//                return true;
//            }
//        }
//        return false;
//    }
}
