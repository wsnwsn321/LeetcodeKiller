package com.company.CompanyList.clutter;

public class lastNsecondLast {
    public static void main(String[] args) {
        String t = "apple";
        String s = lastNSecondLast(t);
        int x=0;
    }
    public static String lastNSecondLast(String s){
        if (s.length()<2) return "";
        String res="";
        for (int i=s.length()-1;i>=0;i--){
            if (i>0&&s.charAt(i)==s.charAt(i-1)) continue;
            char cand = s.charAt(i);
            if (res.indexOf(cand)==-1) res+=cand+" ";
            if (res.length()==4)
                return res.substring(0,res.length()-1);
        }
        return res;
    }
}
