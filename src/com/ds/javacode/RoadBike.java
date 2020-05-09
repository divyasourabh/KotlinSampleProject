package com.ds.javacode;

public class RoadBike extends Bicycle {

    private int tireWidth;

    public RoadBike(int cadence, int gear, int speed, int tireWidth) {
        super(cadence, gear, speed);
        this.tireWidth = tireWidth;
    }

    public int getTireWidth () {
        return tireWidth;
    }

    public void printDescription () {
        super.printDescription();
        System.out.println("The Road bike has a seat height of " + tireWidth + " MM.");

    }
}
