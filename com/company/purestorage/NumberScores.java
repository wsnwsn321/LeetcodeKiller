package com.company.purestorage;

public class NumberScores {
    public static void main(String[] args) {

        System.out.println(solution(789));
    }

    public static int solution(int number){
        char[] num = String.valueOf(number).toCharArray();
        int scores = 0, n = num.length;

        for(int i = 0; i < num.length; i++){
            // condition 1: 9 digits
            if(num[i] - '0' == 9)
                scores += 4;

            // condition 2: consecutive 1s
            if(i > 0 && num[i] == num[i-1] && num[i] == '1')
                scores += 5;

            // condition 5 : even digit
            if((num[i]-'0') % 2 == 0)
                scores += 2;


        }
        // condition 4: digit is 1 more than previous digit
        if(number % 7 == 0)
            scores++;

        // condition 3: sequence of con
        int j = 1, len_consect = 1;
        while(j < num.length){
            while(j < num.length && num[j] - num[j-1] == 1){
                len_consect++;
                j++;
            }
            scores += (int)Math.pow(len_consect,2);
            len_consect = 1;
            j++;
        }
        scores += len_consect == 1?(int)Math.pow(len_consect,2):0;

        return scores;
    }
}
