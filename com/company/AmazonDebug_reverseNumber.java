package com.company;

public class AmazonDebug_reverseNumber {
    public static void main(String[] args) {
            int x = 376;
            reverseNum(x);
    }
    static int reverseNum(int num){
        int reversedNum =0;
        while(num!=0){
            int remainder = num%10;
            reversedNum = remainder+reversedNum*10;
            num/=10;
        }
        return reversedNum;
    }
}
