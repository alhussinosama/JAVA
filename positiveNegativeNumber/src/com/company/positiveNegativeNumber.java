package com.company;
public class positiveNegativeNumber {
    public static void main(String[]args) {
        checkNumber(5);
        checkNumber(-5);
    }

        public static void checkNumber(int number){

            if (number > 0) {
                System.out.println("this Number is Positive");
            } else if (number < 0) {
                System.out.println("this number is Negative");
            } else {
                System.out.println(" this number is Zero");
            }


        }


    }



