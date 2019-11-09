package com.company.CompanyList.Amazon;

import java.util.*;

public class GetString {
    Set<String> set;
    Queue<String> queue;

    public GetString(){
        queue = new LinkedList<>();
        set = new HashSet<>();
    }
    public void insertString(String s){
        queue.offer(s);
        if (set.remove(s)){
            queue.remove(s);
        }
    }

    public String getFirstUniqueString(){
        return queue.size()>0?queue.peek():null;
    }

}
