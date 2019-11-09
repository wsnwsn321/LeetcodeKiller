package com.company.CompanyList.Bloomberg;

public class JosephusProblem {
    public static void main(String[] args) {
        int res = winner(14,2);
        int x=0;
    }
    public static int winner(int n, int m){
        if (n==1) return 1;
        return (winner(n-1,m)+m-1)%n+1;
    }
}
