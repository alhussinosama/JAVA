package com.company;
/*
- create a range number from 1 to 1000.
- sum the numbers tht can divided with 5 and 3.
- print those numbers which met above .
- break the loop once you finde 5 numbers that met above conditions.

 */

public class Main {

    public static void main(String[] args) {
	// create the variables

        int  count = 0;
        int sum = 0 ;
        //create the loop
        for (int i = 1 ; i <= 1000 ; i++) {
            if ( ( i % 3 == 0) && ( i % 5 ==0)){
                count++;
                sum += i ;
                System.out.println( " found number = " + i);
            }
            // if we ve got a 5 number which get the conditions we break.
            if ( count == 5){
                break;
            }
        }
        System.out.println( " Sum = " + sum);
    }
}
