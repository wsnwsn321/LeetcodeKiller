package com.company.salesforce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PurchaseSupplies {
    public static void main(String[] args) {

    }
    public void purchaseSupplies(String input){
        List<String> a =new ArrayList<>();
        Collections.sort(a, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return 0;
            }
        });

    }
}
