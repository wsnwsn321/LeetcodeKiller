package com.company;

import java.util.ArrayList;

public class Solution60_PermutationSequence {
    public static void main(String[] args) {

    }
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> num = new ArrayList<Integer>();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            num.add(i);
        }
        //match index
        k = k - 1;
        for (int i = 0; i < n; i++) {
            fact /= n - i;
            int index = k / fact;
            sb.append(num.remove(index));
            k -= index * fact;
        }
        return sb.toString();
    }
}
