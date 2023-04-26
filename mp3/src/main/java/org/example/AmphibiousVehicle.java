
package org.example;

public class AmphibiousVehicle extends Vehicle implements IBoat {   //Wielodziedziczenie
    private double draft;
    private String hullType;



    public AmphibiousVehicle(int numWheels, double maxSpeed, double draft, String hullType) {
        super(numWheels, maxSpeed);

        this.draft = draft;
        this.hullType = hullType;
    }

    public void drive() {
        System.out.println("Driving an amphibious vehicle with " + super.getNumWheels() + " wheels and a maximum speed of " + getMaxSpeed() + " km/h.");
    }

    public void stop() {
        System.out.println("Stopping the amphibious vehicle.");
    }

//    public int getNumWheels() {
//        return numWheels;
//    }
//
//    public double getMaxSpeed() {
//        return maxSpeed;
//    }

    @Override
    public double GetDraft() {
        return draft;
    }

    @Override
    public String GetHullType() {
        return hullType;
    }

    @Override
    public void sail() {
        System.out.println("Sailing a " + hullType + " boat with a draft of " + draft + " meters.");
    }
}