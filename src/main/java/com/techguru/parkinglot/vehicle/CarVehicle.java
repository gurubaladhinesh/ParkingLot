package com.techguru.parkinglot.vehicle;

public class CarVehicle extends Vehicle {

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.CAR;
    }

    public CarVehicle(String licenseNumber) {
        super(licenseNumber);
    }
}
