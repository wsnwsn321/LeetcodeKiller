package com.company;

import java.util.Stack;
public class Solution901_OnlineStockSpan {
    class Pair{
        int price;
        int span;

        Pair(int price,int span){
            this.price = price;
            this.span = span;
        }
    }
    class StockSpanner {
        Stack<Pair> s = new Stack<>();
        public StockSpanner() {

        }

        public int next(int price) {
            if(price<s.peek().price)
                s.push(new Pair(price,1));
            else{
                int span = 1;
                while(!s.isEmpty()&&price>=s.peek().price){
                    span+=s.pop().span;
                }
                s.push(new Pair(price,span));
            }
            return s.peek().span;
        }
    }
}
