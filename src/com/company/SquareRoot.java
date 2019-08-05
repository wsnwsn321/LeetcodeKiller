package com.company;

public class SquareRoot {
    public static void main(String[] args) {
            int j=0;
    }

    public static double brutleForce(int num){
        double res =0;
        for(double i = 1;i<num/2;i=i+0.1){
            if(num-i*i<0.01) res =i;
        }
        return res;
    }
}
