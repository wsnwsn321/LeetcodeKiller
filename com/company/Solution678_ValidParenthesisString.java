package com.company;

import java.util.Stack;

public class Solution678_ValidParenthesisString {
    public static void main(String[] args) {

    }
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;
        for (char c: s.toCharArray()){
            if (c=='('){
                low++;
                high++;
            }
            else if (c==')'){
                if (low>0)
                    low--;
                high--;
            }
            else {
                //three cases can happen for *
                //take * as ) if and only if there exists unpaired (
                if (low>0)
                    low--;
                //otherwise, take it as ) or empty.
                //it's ok to have high>0 at the end because extra * counted as ) can be changed to empty at the end
                high++;
            }
            if (high<0) return false;
        }
        return low==0;
    }
}
