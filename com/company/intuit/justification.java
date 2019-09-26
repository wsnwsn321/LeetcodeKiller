package com.company.intuit;

import java.util.ArrayList;
import java.util.List;

public class justification {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add("as");
        lines.add("sdsd dfsf");
        reflowLines(2,lines);
    }
    static List<String> reflowLines(int lineLength, List<String> lines) {
        List<String> words = new ArrayList<>();
        List<String> res = new ArrayList<>();
        if(lines.size()==0||lineLength==0) return res;

        for (String x: lines){
            String[] wordsInLine = x.split("\\s+");
            for (String w:wordsInLine){
                words.add(w);
            }
        }
        int index = 0;
        while (index < words.size()) {
            int count = words.get(index).length();
            int last = index + 1;
            while (last < words.size()) {
                if (words.get(last).length() + count + 1 > lineLength) break;
                count += words.get(last).length() + 1;
                last++;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(words.get(index));
            int diff = last - index - 1;
            if (last == words.size() || diff == 0) {
                for (int i = index + 1; i < last; ++i) {
                    sb.append(" ");
                    sb.append(words.get(i));
                }
                for (int i = sb.length(); i < lineLength; i++) {
                    sb.append(" ");
                }
            } else {
                int space = (lineLength - count) / diff;
                int mid = (lineLength - count) % diff;
                for (int i = index+1; i < last; ++i) {
                    for (int j = space; j > 0; --j) {
                        sb.append(" ");
                    }
                    if (mid > 0) {
                        sb.append(" ");
                        mid--;
                    }
                    sb.append(" ");
                    sb.append(words.get(i));
                }
            }
            res.add(sb.toString());
            index = last;
        }
        return res;
    }
}
