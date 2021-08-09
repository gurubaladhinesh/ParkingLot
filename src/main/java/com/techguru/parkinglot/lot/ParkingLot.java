package com.techguru.parkinglot.lot;

import com.techguru.parkinglot.space.ParkingSpace;
import com.techguru.parkinglot.vehicle.Vehicle;

public interface ParkingLot {

    void addParkingSpace(ParkingSpace parkingSpace);

    void vehicleEntry(Vehicle vehicle);

    void vehicleExit(String registration);

    static ParkingLot getInstance() {
        return ParkingLotImpl.getInstance();
    }

}
