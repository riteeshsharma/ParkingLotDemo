package parkingLot.repository;

import parkingLot.exception.ParkingSpotNotFoundException;
import parkingLot.models.ParkingFloor;
import parkingLot.models.ParkingSpot;


import java.util.HashMap;
import java.util.Map;

public class ParkingSpotRepository {
    private Map<Integer, ParkingSpot> parkingSpotMap; // table

    public ParkingSpotRepository() {
        this.parkingSpotMap = new HashMap<>();
    }

    public ParkingSpot get(int parkingSpotId){
        ParkingSpot parkingSpot = parkingSpotMap.get(parkingSpotId);
        if(parkingSpot == null){
            throw new ParkingSpotNotFoundException("ParkingSpot not found for id : " + parkingSpotId);
        }
        return parkingSpot;
    }

    public void put(ParkingSpot parkingSpot){
        parkingSpotMap.put(parkingSpot.getId(), parkingSpot);
        System.out.println("ParkingSpot has been added successfully");
    }
}
