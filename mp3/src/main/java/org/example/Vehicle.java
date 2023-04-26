package org.example;

public abstract class Vehicle { //Klasa abstrakcyjna
    private int numWheels;
    private double maxSpeed;

    public Vehicle(int numWheels, double maxSpeed) {
        this.numWheels = numWheels;
        this.maxSpeed = maxSpeed;
    }

    public abstract void drive();   //polymorphic method invocation

    public abstract void stop();

    public int getNumWheels() {
        return numWheels;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
}