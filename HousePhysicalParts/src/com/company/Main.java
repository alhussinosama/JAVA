package com.company;
/*
- create a single room of a house using composition
-generate the things might be included in the room
  bed wall lamp ceiling
  - method to turnon the lamp
  - method to make the bed
*/

public class Main {

    public static void main(String[] args) {


	// wall project to show the walls
        Wall wall1 = new Wall(" North");
        Wall wall2 = new Wall(" South");
        Wall wall3 = new Wall(" West");
        Wall wall4 = new Wall(" East");
        Ceiling ceiling = new Ceiling( 12 , 55);

        Bed bed = new Bed( " modern" , 4, 3, 2 , 1);

        Lamp lamp = new Lamp(" classic " , false , 10);

        BedRoom bedroom = new BedRoom(" Jakob " , wall1, wall2, wall3,wall4 , ceiling, bed ,lamp);

        //make bed method it is already created just we called it
        bedroom.makeBed();

        // call get lamp and method turn on
        bedroom.getLamp().turnOn();
    }
}
