package com.techguru.parkinglot;

import com.techguru.parkinglot.exception.ParkingSpotNotFoundException;
import com.techguru.parkinglot.exception.TicketNotFoundException;
import com.techguru.parkinglot.spot.ParkingSpot;
import com.techguru.parkinglot.spot.ParkingSpotType;
import com.techguru.parkinglot.vehicle.Vehicle;
import com.techguru.parkinglot.vehicle.VehicleType;

import java.util.*;

public class ParkingLot {

    private static ParkingLot instance;

    private Map<ParkingSpotType, List<ParkingSpot>> totalSpotsMap = new HashMap<>();

    private Map<String, ParkingSpot> accommodatedSpots = new HashMap<>();

    private final Map<VehicleType, ParkingSpotType> spotTypeMap = new HashMap<>();

    static ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
            instance.spotTypeMap.put(VehicleType.BIKE, ParkingSpotType.BIKE_SPOT);
            instance.spotTypeMap.put(VehicleType.CAR, ParkingSpotType.CAR_SPOT);
        }
        return instance;
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        if (totalSpotsMap.containsKey(parkingSpot.getParkingSpotType())) {
            List<ParkingSpot> parkingSpots = totalSpotsMap.get(parkingSpot.getParkingSpotType());
            parkingSpots.add(parkingSpot);
            totalSpotsMap.put(parkingSpot.getParkingSpotType(), parkingSpots);
        } else {
            List<ParkingSpot> parkingSpots = new ArrayList<>();
            parkingSpots.add(parkingSpot);
            totalSpotsMap.put(parkingSpot.getParkingSpotType(), parkingSpots);
        }
    }

    public String accommodateVehicle(Vehicle vehicle) throws ParkingSpotNotFoundException {
        ParkingSpotType parkingSpotType = spotTypeMap.get(vehicle.getVehicleType());
        ParkingSpot parkingSpot = getAvailableSpot(parkingSpotType);
        parkingSpot.accommodateVehicle(vehicle);
        String ticketNumber = vehicle.generateTicketNumber();
        accommodatedSpots.put(ticketNumber, parkingSpot);
        return ticketNumber;
    }

    public double freeVehicle(String ticketNumber) throws TicketNotFoundException {
        if (!accommodatedSpots.containsKey(ticketNumber))
            throw new TicketNotFoundException("Ticket number not found");
        ParkingSpot parkingSpot = accommodatedSpots.get(ticketNumber);
        accommodatedSpots.remove(ticketNumber);
        return parkingSpot.freeVehicle();
    }

    private ParkingSpot getAvailableSpot(ParkingSpotType parkingSpotType) throws ParkingSpotNotFoundException {
        Optional<ParkingSpot> parkingSpotOptional = totalSpotsMap.getOrDefault(parkingSpotType, new ArrayList<>()).stream().filter(ParkingSpot::isFree).findFirst();
        if (parkingSpotOptional.isEmpty())
            throw new ParkingSpotNotFoundException("Parking spot not available" + parkingSpotType);
        return parkingSpotOptional.get();
    }

}