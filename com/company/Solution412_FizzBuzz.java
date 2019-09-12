package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution412_FizzBuzz {
    public static void main(String[] args) {

    }
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i=1;i<=n;++i){
            if(i%15==0) result.add("FizzBuzz");
            else if(i%3==0) result.add("Fizz");
            else if(i%5==0) result.add("Buzz");
            else result.add(Integer.toString(i));
        }
        return result;
    }
}
