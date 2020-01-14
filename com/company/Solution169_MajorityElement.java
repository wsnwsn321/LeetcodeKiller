package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution169_MajorityElement {
    public static void main(String[] args) {

    }
    public static int majorityElement(int[] nums) {
        int majNumber = 0;
        int count = 0;
        for (int x : nums) {
            if (count == 0) {
                majNumber = x;
            }
            count += x == majNumber ? 1 : -1;

        }
        return majNumber;
    }

}
