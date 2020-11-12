package com.company;
/*
    -create a method called getDurationString with 2 parameters ,1st parameters
        minutes and 2nd is seconds.
    -validate minutes >=0 and seconds >=0 and <=59
    - the method should return a value - calculate how many hours minutes seconds
    and print the value as a string
    **
    - create a 2nd method of the same name but with one parameters seconds
    -validate the value >=0 then calculate how many minutes ,seconds

*/

public class Main {

    public static void main(String[] args) {
        System.out.println( getDurationString(65 , 45));
        System.out.println( getDurationString( 3900));

    }
    private static String getDurationString( long minutes , long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return " Invalid value";
        }
        long hours = minutes / 60;
        long remainingHours = minutes % 60;
        return hours + " h " + remainingHours + " m " + seconds + " s ";
    }
    private static String getDurationString ( long seconds){
        if ( seconds < 0 ){
            return " Invaild Value";
        }
        long minutes = seconds / 60 ;
        long remainingSeconds = seconds % 60 ;
        return getDurationString(minutes , remainingSeconds);

        }
    }

