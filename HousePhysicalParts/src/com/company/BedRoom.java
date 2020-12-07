package com.company;

public class BedRoom {
    // generate the variable in the bedroom
    private String name;
    private Wall wall1; // class wall
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling; // class ceiling
    private Bed bed;
    private Lamp lamp ;

    // generate the constructor

    public BedRoom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    // generate the getter just for the lamp to make it clear and simple.

    public Lamp getLamp() {
        return lamp;
    }
    // generate a public method to make the bed
    public void makeBed(){
        System.out.println(" Bedroom -> making bed");
        bed.make();
    }
}
