package com.company;
import java.util.Scanner;
    /*
    -read the numbers and print the minimum and the maximum number
    - print message " enter numbers"
   
     */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = 0 ;
        int min = 0 ;
        boolean first = true ;

        while(true) {
            System.out.println(" enter a number : ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                if (first){
                    first = false;
                    min = number ;
                    max = number ;

                }
                if ( number > max ) {
                    max = number ;

                }
                if (number < min){
                    min = number ;

                }
            }else{
                break ;
            }
            scanner.nextLine();
        }
        System.out.println( " min = " + min + " max = " + max);



        scanner.close();
    }
}
