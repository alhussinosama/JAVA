package com.company;
// write a method . which should return a value using switch statement

public class Main {

    public static void main(String[] args) {
	//calling the method

        printDayOfTheWeek(10);
        printDayOfTheWeek(3);
        printDayOfTheWeek(0);
    }


    // the method definition
    private static void printDayOfTheWeek ( int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println( "Invaild Value");
        }
    }
}
