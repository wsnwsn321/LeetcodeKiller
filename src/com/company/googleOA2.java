package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class googleOA2 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 20, 11, 16};
        int[] b = new int[]{5, 10, 17};
        solution(a,b);
    }
    public static int[] solution(int[] stores, int[] houses) {
        // write your code in Java SE 8
        List<Integer> sortedStores = new ArrayList<>();
        int[] sortedStore = new int[stores.length];
        for(int x: stores){
            sortedStores.add(x);
        }
        Collections.sort(sortedStores);
        int k=0;
        for(int x:sortedStores){
            sortedStore[k] = x;
            k++;
        }
        int[] result = new int[houses.length];
        for(int i=0;i<houses.length;++i){
            result[i] = findStore(sortedStore,houses[i]);
        }
        return result;
    }
    public static int findStore(int[] store, int h){
        if(h < store[0]) {
            return store[0];
        }
        if(h > store[store.length-1]) {
            return store[store.length-1];
        }

        int start = 0;
        int end = store.length-1 ;

        while (start  <= end) {
            int mid = (start + end) / 2;

            if (h < store[mid]) {
                end = mid - 1;
            } else if (h > store[mid]) {
                start = mid + 1;
            } else {
                return store[mid];
            }
        }
        if((store[start] - h) < (h - store[end])){
            return store[start];
        }
        else{
            return store[end];
        }
        //return (store[start] - h) < (h - store[end]) ? store[start] : store[end];
    }
}


