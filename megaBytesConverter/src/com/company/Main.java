package com.company;

public class Main {

    public static void main(String[] args) {
	printMegaBytesAndKiloBytes(2000);
	printMegaBytesAndKiloBytes(3259);

    }
    public static void printMegaBytesAndKiloBytes ( int kiloByte){
        int megaByte = kiloByte / 1000 ;
        int remainder = kiloByte % 1000 ;
        System.out.println( kiloByte + " kilobytes = " + megaByte +" megabytes and " + remainder + " kilobytes" );

    }
}
