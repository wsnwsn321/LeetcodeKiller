package com.company.Bloomberg;

public class deleteConseq3 {
    public static void main(String[] args) {
        String s = "aaxbbcccba";
        String x =checkConseq(s);
        int q = 0;
    }

    public static String checkConseq(String s){
        int i=0;
        while (i<s.length()){
            int conseqLength = if3(i,s);
            while (i+conseqLength-1<s.length()&&conseqLength>=3){
                s = s.substring(0,i)+s.substring(i+conseqLength);
                if (i>0) i--;
                while (i-1>=0&&s.charAt(i)==s.charAt(i-1)) {
                    i--;
                }
                conseqLength = if3(i,s);
            }
            i+=conseqLength;
        }
        return s;
    }
    public static int if3(int index,String s){
        int count=1;
        while (index+1<s.length()&&s.charAt(index)==s.charAt(index+1)){
            count++;
            index++;
        }
        return count;
    }
}
