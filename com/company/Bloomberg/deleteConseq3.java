package com.company.Bloomberg;

import java.util.Stack;

public class deleteConseq3 {
    public static void main(String[] args) {
        String s = "AADHSHHHHSSHHSSSJJJJJDD";
        String x =checkConseq(s);
        int q = 0;
    }

    //O(n)
    public static String checkConseq(String s) {
        Stack<Character> stack = new Stack<>();
        int count3=1;
        for (int i=0;i<s.length();++i){
            if (stack.size()==0||stack.peek()!=s.charAt(i)){
                stack.push(s.charAt(i));
                count3=1;
            }
            else if(stack.peek()==s.charAt(i)&&count3<3) {
                stack.push(s.charAt(i));
                count3++;
            }
            if (count3>=3){
                char removed = s.charAt(i);
                while ( i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                    i++;
                }
                while (stack.size()>0&&stack.peek() == removed) stack.pop();
                count3 = getCurrentTop(stack);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static int getCurrentTop(Stack<Character> stack){
        if (stack.size()==0) return 1;
        Stack<Character> temp = new Stack();
        temp.addAll(stack);
        int count=1;
        char top = temp.peek();
        while (temp.size()>0&&temp.peek()==top) {
            temp.pop();
            count++;
        }
        return count;
    }
}
