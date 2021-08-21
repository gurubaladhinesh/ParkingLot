package com.techguru.parkinglot.vehicle;

public abstract class Vehicle {

    private String licenseNumber;

    public abstract VehicleType getVehicleType();

    public Vehicle(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String generateTicketNumber() {
        return "T" + System.currentTimeMillis();
    }
}
