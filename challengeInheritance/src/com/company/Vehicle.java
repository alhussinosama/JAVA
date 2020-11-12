package com.company;

public class Vehicle {
    // generate a variables
    private String name;
    private String size;

    // create another varibles

    private int currentVelocity;
    private int currentDirection;

    // make the constructor

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;

    }
    // generate a steer method
    public void steer( int direction){
        this.currentDirection += direction;
        System.out.println(" Vehicle.steer() : Steering at :" + currentDirection + " degrees");
    }
    // generate another method for move with 2 parameters
    public void move( int velocity , int direction ) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println(" Vehicle.move() : moving at : " + currentVelocity + "in direction : " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    // generate a stop method
    public void stop(){
        this.currentVelocity = 0 ;
    }
}
