package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution811 {
    public static void main(String[] args) {
        String[] result = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        subdomainVisits(result);
    }
    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> result = new ArrayList<>();
        int count=0;
        for (String s: cpdomains) {
            s = s.substring(s.indexOf(" ")+1,s.length());
            result.add(count+" "+s);
            while(s.contains(".")){
                s = s.substring(s.indexOf('.')+1,s.length());
                result.add(count+" "+s);
            }
            count++;
        }
        List<String> newResult = new ArrayList<>();

        for (int i=0;i<result.size();i++) {
            int totalNum = 0;
            String singleElement = result.get(i).substring(result.get(i).indexOf(" ")+1,result.get(i).length());
            for (String d:result) {
                if(d.substring(d.indexOf(" ")+1,d.length()).equals(singleElement)){
                    int getIndex =Integer.parseInt(d.substring(0,d.indexOf(" ")));
                    totalNum += Integer.parseInt(cpdomains[getIndex].substring(0,cpdomains[getIndex].indexOf(" ")));
                }
            }

            if(!newResult.contains(totalNum+ " "+singleElement)){
                newResult.add(totalNum+ " "+singleElement);

            }
        }

            return newResult;
    }

}
