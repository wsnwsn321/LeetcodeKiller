package com.company;

import java.util.ArrayList;
import java.util.List;

public class NianticOA {
    public static void main(String[] args) {
        String p = "(";
        pat(p);

    }

    public static String pat(String p){
        char[] a = p.toCharArray();
        List<Character> l = new ArrayList<>();
        for(int i=0;i<a.length;++i){
            if(a[i]=='('){
                l.add(a[i]);
            }
            else if(a[i]==')'){
                if(l.isEmpty()){
                    p='('+p;
                }
                else{
                    l.remove(l.size()-1);
                }
            }
        }
        if(!l.isEmpty()){
            for(int i=0;i<l.size();++i){
                p=p+')';
            }
        }
        return p;
    }
}
