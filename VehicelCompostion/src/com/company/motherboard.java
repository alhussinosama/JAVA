package com.company;

public class motherboard {
    private String model ;
    private String manufacturer;
    private int ramSlot;
    private int cardSlot;
    private String bios;

    // generate the constructor

    public motherboard(String model, String manufacturer, int ramSlot, int cardSlot, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }
    // after the getter we gonna generate a new method called loadprogram
    public void loadProgram( String programName){
        System.out.println(" the program " + programName + " is now loading ....");
    }

    // generate the getter
    public String getModel (){
        return model;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public int getRamSlot(){
        return ramSlot;
    }
    public int getCardSlot(){
        return cardSlot;
    }
    public String getBios(){
        return bios;
    }
}
