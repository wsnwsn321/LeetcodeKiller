package com.company.citrix;

public class TheFinalProblem {
    public static void main(String[] args) {
        String t = "10111101010101110101010100010101010111111110";
        flip(t);
    }
    public static int flip(String target) {
        int count = 0;
        int n = target.length();
        if (target.charAt(0) == '1') count++;
        for (int i = 1; i < target.length(); ++i) {
            if (target.charAt(i) != target.charAt(i - 1)) count++;
        }
        return count;

    }
}
