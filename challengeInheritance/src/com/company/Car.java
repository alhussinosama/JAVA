package com.company;

public class Car extends Vehicle {

    // generate the variables

    private int wheels ;
    private int doors ;
    private int gears ;
    private boolean isManual;

    private int currentGear;

    // genreate the constructors and delete the currentgear and but 1 ,


    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }
    //generate the setter just for the currentgear

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("car.setcurrentgear() : changes to " + this.currentGear + " gear");

    }
    // create a new method and call the move method
    public void changeVelocity( int speed , int direction){
        System.out.println(" car.changevelocity() : velocity " + speed + "direction" + direction );
        move(speed , direction );

    }
}
