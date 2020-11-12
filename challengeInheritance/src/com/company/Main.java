package com.company;
/*
create a class of vehicle, then car class that inherits from vehicle.
- create another class , a specific type of car that inherits from car class.
you should be able to hand steering , changing gears and moving speed
you will want to decide where to put the appropriate stter and behaiours
for you specific type of vehicle you will want to add something specific for that type of car.
 */

public class Main {

    public static void main(String[] args) {


        Outlander outlander = new Outlander( 36);

        outlander.accelerate(30);

    }
}
