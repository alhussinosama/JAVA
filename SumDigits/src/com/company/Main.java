package com.company;

public class Main {
    // this challenge to sum the digits of the numbers
    // for example  125 the sum of this number is 1+2+5 = 8
    public static void main(String[] args) {
        System.out.println( "the sum of the digits 125 =" + sumDigits(125));
        System.out.println( "the sum of the digits 5 =" + sumDigits(5));
        System.out.println( "the sum of the digits -125 =" + sumDigits(-125));
        System.out.println( "the sum of the digits 3652 =" + sumDigits(3652));
        System.out.println( "the sum of the digits 0 =" + sumDigits(0));

    }

    private static int sumDigits(int number){
        if( number < 10){
           return -1;
        }
        int sum = 0;
        // 125  > 125/10 =12 > 12*10=120 > 125-120 = 5
        while( number >0) {
            //extract thr lest - significant digit
            int  digit = number % 10 ;
            sum += digit;
            // drop thr least - significant digit
            number /=10; // same as number = number /10

        }
       return sum;
    }
}
