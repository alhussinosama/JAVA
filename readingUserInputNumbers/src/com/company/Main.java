package com.company;

        /*
        -read 10 numbers from the console - print the sum of those.
        -create a scanner -using also the hasNextInt() method from scanner value
        -if hasNextInt() return false print message ' invalid Number'
        continue reading until 10 num.
        -using the nextInt() method to get the number and add it to the sum.
        - we will use the while-loop - use counter variable for counting numbers
        - we will close the scanner when we will not need it.
        -create a project called readingUserInputChallenge.
         */
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// create the scanner
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

       // while(true){
        while(counter < 10){
            int order = counter +1 ;
            System.out.println(" Enter number # " + order + " :");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;

                // breaking the loop after 10 number
               /* if ( counter == 10){
                    break;
                } */
            }else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line - enter key
        }
            // print to the console
        System.out.println( "sum = " + sum);

        // close the scanner
        scanner.close();
    }
}
