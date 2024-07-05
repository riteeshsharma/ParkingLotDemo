package parkingLot.repository;


import parkingLot.exception.ParkingFloorNotFoundException;
import parkingLot.exception.ParkingLotNotFoundException;
import parkingLot.models.ParkingFloor;
import parkingLot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {
    private Map<Integer, ParkingFloor> parkingFloorMap; // table

    public ParkingFloorRepository() {
        this.parkingFloorMap = new HashMap<>();
    }

    public ParkingFloor get(int parkingFloorId){
        ParkingFloor parkingFloor = parkingFloorMap.get(parkingFloorId);
        if(parkingFloor == null){
            throw new ParkingFloorNotFoundException("ParkingFloor not found for id : " + parkingFloorId);
        }
        return parkingFloor;
    }

    public void put(ParkingFloor parkingFloor){
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        System.out.println("parkingFloor has been added successfully");
    }
}
