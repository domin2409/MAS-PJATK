package org.example;

import java.util.Optional;

public class Car extends Vehicle {
    protected int numDoors;
    protected String engineType;
    protected Optional<Integer> spoilerSize;      //Przykłady realizacji dziedziczenia wieloaspektowego
    protected Optional<Integer> spoonSize;
    public Car(int numWheels, double maxSpeed, int numDoors, String engineType, Optional<Integer> spoilerSize, Optional<Integer> spoonSize) {
        super(numWheels, maxSpeed);
        this.numDoors = numDoors;
        this.engineType = engineType;
        this.spoilerSize = spoilerSize;
        this.spoonSize = spoonSize;
    }

    public Car(Vehicle prevVehicle, int numDoors, String engineType, Optional<Integer> spoilerSize, Optional<Integer> spoonSize) {
        super(prevVehicle.getNumWheels(), prevVehicle.getMaxSpeed());
        this.numDoors = numDoors;
        this.engineType = engineType;
        this.spoilerSize = spoilerSize;
        this.spoonSize = spoonSize;
    }
    public void driveFast() {
        if(!spoilerSize.isEmpty()){
            System.out.println("Driving a car super fast wroom wroom!");
        } else {
            System.out.println("Can't drive too quick :(");
        }
    }
    public void digAHole() {
        if(!spoonSize.isEmpty()){
            System.out.println("Digging a super deep hole!");
        } else {
            System.out.println("Can't do, shorry :(");
        }
    }
    public void drive() {
        System.out.println("Driving a car with " + numDoors + " doors and " + engineType + " engine.");
    }

    public void stop() {
        System.out.println("Stopping the car.");
    }

    public int getNumDoors() {
        return numDoors;
    }

    public String getEngineType() {
        return engineType;
    }
}
