package com.company;

public class Car extends Vehicel {
    private int doors;
    private int engineCapacity;

    // generate the constructor


    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
