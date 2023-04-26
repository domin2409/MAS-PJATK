package org.example;

import java.util.EnumSet;
import java.util.Optional;
enum ElectricCarType {ElectricCar, ToyCar, SunPoweredCar}  //overlapping
public class ElectricCar extends Car {
    private double batteryRange;
    private double chargingTime;
    private EnumSet<ElectricCarType> electricCarKind;

    public ElectricCar(int numWheels, double maxSpeed, int numDoors, String engineType, double batteryRange, double chargingTime, Optional<Integer> spoilerSize, Optional<Integer> spoonSize, EnumSet<ElectricCarType> electricCarKind) {
        super(numWheels, maxSpeed, numDoors, engineType, spoilerSize, spoonSize);
        this.batteryRange = batteryRange;
        this.chargingTime = chargingTime;
        this.electricCarKind = electricCarKind;
    }

    public void drive() {
        System.out.println("Driving an electric car with " + getNumDoors() + " doors and " + getEngineType() + " engine, with a range of " + batteryRange + " miles.");
    }

    public double getBatteryRange() {
        return batteryRange;
    }

    public double getChargingTime() {
        return chargingTime;
    }
}
