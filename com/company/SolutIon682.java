package com.company;

import java.util.ArrayList;
import java.util.List;

public class SolutIon682 {
    public static void main(String[] args) {
        String[] a = new String[]{"-2","4","C","D","9","+","+"};
        calPoints(a);
    }
    public static int calPoints(String[] ops) {
        int sum=0;
        List<Integer> validInt = new ArrayList<>();
        for(int i=0;i<ops.length;i++){
            String current = ops[i];
            if(current.equals("C")){
                validInt.remove(validInt.size()-1);
            }
            else if(current.equals("D")){
               validInt.add(validInt.get(validInt.size()-1)*2);
            }
            else if(current.equals("+")){
                validInt.add(validInt.get(validInt.size()-1)+validInt.get(validInt.size()-2));
            }
            else{
                validInt.add(Integer.parseInt(current));
            }
        }

        for(int x:validInt){
            sum+=x;
        }
        return sum;
    }
}
