package src.com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution763_PartitionLabel {
    public static void main(String[] args) {

    }
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();
        int[] last = new int[26];
        for (int i = 0; i < S.length(); ++i)
            last[S.charAt(i) - 'a'] = i;
        int s=0,e =0;
        for (int i = 0; i < S.length(); ++i){
             e = Math.max(e,last[S.charAt(i)-'a']);
             if(i==e){
                res.add(e-s+1);
                s = e+1;
             }
        }
        return res;
    }

}
