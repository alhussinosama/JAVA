package com.company;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    // generate the constructor

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;

    }
    // generate a method called draw pixel at
    public void drawPixelAt( int x , int y , String color){
        System.out.println(" drawing pixel at " + x + "," + y + " at color " + color);
    }
    // generate the getter
    public String getModel(){
        return model;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public int getSize(){
        return size;

    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
