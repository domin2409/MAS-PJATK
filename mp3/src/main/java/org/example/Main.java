package org.example;

import java.util.EnumSet;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("ordinaryCar");
        Car ordinaryCar = new Car(4, 120.0, 4, "gasoline", Optional.empty(),Optional.empty());
        ordinaryCar.drive();
        ordinaryCar.stop();
        System.out.println();

        System.out.println("Matiz");
        Car matiz = new Car(4, 190.0, 4, "gasoline", Optional.of(90),Optional.empty());
        matiz.drive();
        matiz.driveFast();
        matiz.digAHole();
        matiz.stop();
        System.out.println();

        System.out.println("Widłak");
        Car widlak = new Car(4, 190.0, 4, "gasoline", Optional.of(90),Optional.empty());
        widlak.drive();
        widlak.driveFast();
        widlak.digAHole();
        widlak.stop();
        System.out.println();

        System.out.println("Gruzin");
        DamagedCar gruzin = new DamagedCar(matiz, false);
        gruzin.drive();
        gruzin.stop();
        System.out.println();

        System.out.println("Jak nowy");
        Car jakNowy = new Car(gruzin, 3, "gaz", Optional.of(60), Optional.empty());
        jakNowy.drive();
        jakNowy.stop();
        System.out.println();

        System.out.println("Sun toy car");
        ElectricCar sunToy = new ElectricCar(4, 120.0, 4, "electric", 250.0, 8.0,Optional.empty(),Optional.empty(), EnumSet.of(ElectricCarType.ToyCar, ElectricCarType.SunPoweredCar));
        sunToy.drive();
        sunToy.stop();
        System.out.println();

        System.out.println("Amfibia");
        AmphibiousVehicle amphibiousVehicle = new AmphibiousVehicle(4, 100.0, 1.5, "Catamaran");
        amphibiousVehicle.drive();
        amphibiousVehicle.sail();
        System.out.println();
    }
}