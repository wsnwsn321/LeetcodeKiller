package com.company.CompanyList.Amazon;

public class StepsToZero {
    public static void main(String[] args) {
        solution("00101");
    }
    public static int solution(String bin){
        int dec = Integer.parseInt(bin,2);
        int steps=0;
        while (dec>0){
            if (dec%2==0){
                dec/=2;
            }
            else
                dec-=1;
            steps++;
        }
        return steps;
    }
}
