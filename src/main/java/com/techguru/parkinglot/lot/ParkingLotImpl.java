package com.techguru.parkinglot.lot;

import com.techguru.parkinglot.space.ParkingSpace;
import com.techguru.parkinglot.vehicle.Vehicle;

public class ParkingLotImpl implements ParkingLot {

    private static ParkingLotImpl instance;

    @Override
    public void addParkingSpace(ParkingSpace parkingSpace) {

    }

    @Override
    public void vehicleEntry(Vehicle vehicle) {
        
    }

    @Override
    public void vehicleExit(String registration) {

    }

    private ParkingLotImpl() {

    }

    static ParkingLotImpl getInstance() {
        if (instance == null) {
            instance = new ParkingLotImpl();
        }
        return instance;
    }
}
