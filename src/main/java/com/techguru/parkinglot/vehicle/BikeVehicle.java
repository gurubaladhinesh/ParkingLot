package com.techguru.parkinglot.vehicle;

public class BikeVehicle extends Vehicle {

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.BIKE;
    }

    public BikeVehicle(String licenseNumber) {
        super(licenseNumber);
    }

}
