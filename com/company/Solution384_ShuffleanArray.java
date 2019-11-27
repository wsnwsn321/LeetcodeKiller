package com.company;

import java.util.Arrays;
import java.util.Random;

public class Solution384_ShuffleanArray {

    class Solution {

        int[] og;
        int[] shuffle;
        public Solution(int[] nums) {
            og = Arrays.copyOf(nums,nums.length);
            shuffle =  Arrays.copyOf(nums,nums.length);
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return og;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            Random rand = new Random();
            for (int i=0;i<og.length;++i){
                int pos = i+rand.nextInt(og.length-i);
                int temp = shuffle[i];
                shuffle[i] = shuffle[pos];
                shuffle[pos] =temp;
            }
            return shuffle;
        }
    }
}
