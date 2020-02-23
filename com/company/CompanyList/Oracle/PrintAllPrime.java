package com.company.CompanyList.Oracle;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPrime {
    public static void main(String[] args) {
        int x = 101;
        List<Integer> q = countPrimes(x);
        int y =1;
    }
    public static List<Integer> countPrimes(int n) {
        List<Integer> res= new ArrayList<>();
        boolean[] check = new boolean[n];
        for (int i=2;i<n;++i){
            if (check[i]) continue;
            res.add(i);
            for (int j=i;j<n;j = j+i)
                check[j] = true;
        }
        return res;
    }

    }
