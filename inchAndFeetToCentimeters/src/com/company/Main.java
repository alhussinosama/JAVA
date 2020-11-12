package com.company;

public class Main {
    // create a method called calcFeetAndInchToCentimeters/two parameters.
    //feet and inch the parameters
    //validate if the 1st parameters feet is >0
    //validate the inch is >0 & <=12
    // return -1 if either of the above is not true.
    // if the parameters are valid then calculate to cm
    //comprise the feet and inch passed in this method and return the value
    //create a method with a one parameter inches -validate >=0
    //return -1 if its not - if not calculate how many feet are in the inches
    //then here is  the tricky part
    //call the other overload method passing the correct feet and inches
    //calculate so that it can calculate correctly
    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(6,13);
        if ( centimeters < 0.0){
            System.out.println("invalid parameters");
        }
        calcFeetAndInchesToCentimeters(157);
    }

    public static double calcFeetAndInchesToCentimeters(double feet , double inches) {
        if ( (feet < 0) || ((inches < 0) || ( inches >=12))){
            System.out.println(" invalid feet or inches parameters");
            return -1;
        }
        double centimeters =(feet *12) *2.54;
                centimeters += (inches *2.54);
        System.out.println( feet +" feet " + inches +" inches " + " cm " + centimeters);
        return centimeters ;

    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if ( inches < 0){
            return -1;
        }
        double feet = (int) inches / 12 ;
        double remainingInches = (int) inches % 12 ;
        System.out.println(inches + " inches is equal to " + feet +
                " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters( feet , remainingInches);

    }
}
