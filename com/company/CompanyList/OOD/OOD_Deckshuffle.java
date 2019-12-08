package com.company.CompanyList.OOD;

import java.util.Random;
import java.util.Stack;

public class OOD_Deckshuffle {
    int top;
    Stack<Integer> s = new Stack<>();
    int[] deck = {0, 1, 2, 3, 4, 5, 6, 7, 8,
                9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22,
                23, 24, 25, 26, 27, 28, 29,
                30, 31, 32, 33, 34, 35, 36,
                37, 38, 39, 40, 41, 42, 43,
                44, 45, 46, 47, 48, 49, 50,
                51};

    public OOD_Deckshuffle(){

    }

    public void shuffle(int length){
        Random rand = new Random();
        for (int i=0;i<length;++i){
            int r = i + rand.nextInt(length - i);
            int temp = deck[r];
            deck[r] = deck[i];
            deck[i]=temp;
        }
        top=0;

    }

    public int[] getDeck() {
        return deck;
    }

    public  int getTopCard(int[] deck){
        return deck[top++];
    }

    public int getTop() {
        return top;
    }

    public static void main(String[] args) {
        OOD_Deckshuffle o = new OOD_Deckshuffle();
        o.shuffle(52-o.getTop());
        o.getTopCard(o.getDeck());
    }

}
