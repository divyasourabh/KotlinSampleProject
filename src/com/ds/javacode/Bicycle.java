package com.ds.javacode;

public class Bicycle {
    private int cadence;
    private int gear;
    private int speed;

    public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void applyBrake (int decrement) {
        speed -= decrement;
    }

    public void speedUp (int increment) {
        speed += increment;
    }

    public void printDescription () {
        System.out.println("Bike is in gear" + gear +
                "with a cadence of " + cadence +
                "travelling at a speed of " + speed + ".");
    }
}
