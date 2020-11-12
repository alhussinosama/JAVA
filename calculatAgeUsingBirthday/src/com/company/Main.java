package com.company;
// ****** create a code to calculate your age from a birthday given *****

import java.io.*;
import java.sql.SQLOutput;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) throws IOException {
        // generate the variables
	int calendarDay,calendarMonth,calendarYear;
	String birthDate,birthDay,birthMonth,birthYear;

	Calendar date = Calendar.getInstance();

	calendarDay = date.get(Calendar.DATE);
	calendarMonth = date.get( Calendar.MONTH);
	calendarYear = date.get( Calendar.YEAR);

	//reading character-based data from a file in Java
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nEnter Your Birth date in DD-MM-YY");
        birthDate = br.readLine();

        System.out.println(" your birth date is : " + birthDate );
        System.out.println(" today is : " + calendarDay +" " + ( calendarMonth+1) +" " +calendarYear );

        birthDay = birthDate.substring(0,2);
        if (birthDate.length() == 10){
            birthMonth = birthDate.substring(3,5);
            birthYear = birthDate.substring(6,10);

        }else {
            birthMonth = birthDate.substring(2,4);
            birthYear = birthDate.substring( 5,9);
        }
        calendarMonth = Integer.parseInt(birthYear);
        calendarYear = (calendarYear) - (calendarMonth);
        System.out.println("\n your are now : " + calendarYear +" years old" );

    }
}
