package com.company;

public class Solution67_AddBinary {
    public static void main(String[] args) {

    }
    //time:     O(n) n=max(a,b)
    //space:    O(n)
    public String addBinary(String a, String b) {
        String res = "";
        int i = a.length() - 1, j = b.length() - 1;
        int up = 0;
        while (i >= 0 || j >= 0) {
            int n1 = i < 0 ? 0 : a.charAt(i) - '0';
            int n2 = j < 0 ? 0 : b.charAt(j) - '0';
            int sum = n1 + n2 + up;
            up = sum / 2;
            res = sum % 2 + res;
            i--;
            j--;
        }
        if (up == 1)
            res = 1 + res;
        return res;
    }
}
