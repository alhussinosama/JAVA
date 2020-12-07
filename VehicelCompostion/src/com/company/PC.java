package com.company;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private motherboard theMotherboard;

    // constructor

    public PC(Case theCase, Monitor monitor, motherboard theMotherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.theMotherboard = theMotherboard;
    }
    // getter

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public motherboard getTheMotherboard() {
        return theMotherboard;
    }
}
