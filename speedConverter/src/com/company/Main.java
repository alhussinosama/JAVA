package com.company;

public class Main {
    //write a method to convert from Kilometer /hour to Miles/hour.
    // if the value <0 the out put is " invalid value"
    // else make the calculating .
    public static void main(String[] args) {
       double miles = kiloToMiles.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        kiloToMiles.printConversion(10.5);
    }
}

