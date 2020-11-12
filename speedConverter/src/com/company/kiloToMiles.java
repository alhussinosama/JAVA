package com.company;

public class kiloToMiles {
    public static long toMilesPerHour ( double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            return -1;
        }
        return Math.round( kilometerPerHour / 1.609);
    }

// create a new method to calculate
public static void printConversion( double kilometerPerHour) {
    if (kilometerPerHour < 0) {
        System.out.println(" invalid Value");
    } else {
        long milesPerHour = toMilesPerHour(kilometerPerHour);
        System.out.println(kilometerPerHour + " Km/h =" + milesPerHour + " mi/h");
    }
}
}


