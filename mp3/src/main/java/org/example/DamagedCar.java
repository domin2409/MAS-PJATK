package org.example;

import java.util.Optional;

public class DamagedCar extends Vehicle{
    private boolean canItDrive;

    public DamagedCar(int numWheels, double maxSpeed, boolean canItDrive) {
        super(numWheels, maxSpeed);
        this.canItDrive = canItDrive;
    }



    public DamagedCar(Vehicle prevVehicle, boolean canItDrive) {
        super(prevVehicle.getNumWheels(), prevVehicle.getMaxSpeed());
        this.canItDrive = canItDrive;
    }

    @Override
    public void drive() {
        if(canItDrive) System.out.println("More like rolling than driving");
        else System.out.println("More like rolling than driving");

    }

    @Override
    public void stop() {
        System.out.println("Can't be more stopped than this");
    }
}
