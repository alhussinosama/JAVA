package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions( 20, 20 , 5);
	    Case theCase = new Case( "220B" ,"Dell", "240",
            dimensions);
	    Monitor theMonitor = new Monitor( " 27inch Beast" , "Asus ", 27 , new Resolution( 2540 , 1440));
	    motherboard theMotherboard = new motherboard ( "BJ-200" , "Asus" , 4,6, "v2.44");
	    PC thePC = new PC( theCase , theMonitor , theMotherboard);
	    thePC.getMonitor().drawPixelAt(1500,1200, "blue");// calling the method for the pixel
        thePC.getTheMotherboard().loadProgram(" windows 10.5");
        thePC.getTheCase().pressPowerButton();





    }
}
