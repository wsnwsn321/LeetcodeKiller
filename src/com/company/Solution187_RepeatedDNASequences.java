package src.com.company;

import java.util.*;

public class Solution187_RepeatedDNASequences {
    public static void main(String[] args) {

    }
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> m = new HashMap<>();
        Set<String> result = new HashSet<>();
        int length =10;
        for (int i=0;i<s.length()-10;++i){
            String word = s.substring(i,i+length);
            if (m.containsKey(word)) {
                result.add(word);
            }
            else{
                m.put(word,1);
            }
        }

        return new ArrayList<>(result);
    }
}
