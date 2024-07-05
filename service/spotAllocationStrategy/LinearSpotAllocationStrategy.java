package parkingLot.service.spotAllocationStrategy;

import parkingLot.exception.ParkingSpotNotFoundForVehicleException;
import parkingLot.models.ParkingFloor;
import parkingLot.models.ParkingLot;
import parkingLot.models.ParkingSpot;
import parkingLot.models.Vehicle;
import parkingLot.models.enums.ParkingSpotStatus;

import java.util.List;

public class LinearSpotAllocationStrategy implements SpotAllocationStrategy{
    @Override
    public ParkingSpot getSpotForVehicle(ParkingLot parkingLot,Vehicle vehicle) {
        List<ParkingFloor> parkingFloors = parkingLot.getFloors();
        //TODO : add the required validations
        for(ParkingFloor parkingFloor : parkingFloors){
            for(ParkingSpot parkingSpot : parkingFloor.getParkingSpots()){
                if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY) &&
                        parkingSpot.getVehicleType().equals(vehicle.getVehicleType())
                ){
                    return parkingSpot;
                }
            }
        }
        throw new ParkingSpotNotFoundForVehicleException("Please go home, eat and sleep");
    }
}
