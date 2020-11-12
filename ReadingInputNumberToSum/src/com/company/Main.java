package com.company;


import java.util.Scanner;

/*
        read the numbers from the console which entered by the user.
        create Scanner.
        use the hasNextInt() method from the scanner to check
        if the user has entered Int value.
        if hasNextInt() return false , print the message 'Invaild Number '
        continue reading until 10 numbers.
        use the nextInt() method to get the Number and add it to the sum.
        before the user enters each number ,print the message 'Enter number x'
        represents te count .
        hints use while loop - counter.

 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner method to read the entered numbers

        int counter = 0 ;
        int sum = 0 ;
        while ( true) {
            int oder = counter + 1 ;
            System.out.println( "Enter number #" + oder + ":");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                    int number = scanner.nextInt();
                    counter ++ ;
                    sum += number ;

                    // break the loop after 10 numbers
                    if ( counter == 10) {
                        break;
                    }
            }else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); // handel end of the line ( enter key)
        }

        System.out.println( " sum = " + sum);
        scanner.close();
    }
}
