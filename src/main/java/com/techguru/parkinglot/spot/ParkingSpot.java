package com.techguru.parkinglot.spot;

import com.techguru.parkinglot.vehicle.Vehicle;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class ParkingSpot {

    private boolean isFree = true;

    private Vehicle vehicle = null;

    private LocalDateTime accommodatedTime = null;

    public abstract ParkingSpotType getParkingSpotType();

    public abstract double getPerHourRate();

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public void accommodateVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isFree = false;
        this.accommodatedTime = LocalDateTime.now();
    }

    public double freeVehicle() {
        long accommodatedHours = Duration.between(accommodatedTime, LocalDateTime.now()).plusHours(1).toHours();
        double charge = getPerHourRate() * accommodatedHours;
        this.vehicle = null;
        this.isFree = true;
        return charge;
    }


}
