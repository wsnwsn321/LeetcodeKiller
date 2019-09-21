package com.company.ibm;

public class PurchasingSupplies {
    public static void main(String[] args) {
        purchasingSupplies(12,3,5);
    }
    public static int purchasingSupplies(int n, int c, int m){
        int res=0;
        int returned = n/c;
        res+=returned;
        while (returned>=m){
            res+=returned/m;
            returned=returned/m;
        }
        return res;
    }
}
