package parkingLot.service.spotAllocationStrategy;

import parkingLot.models.ParkingSpot;
import parkingLot.models.Vehicle;
import parkingLot.models.ParkingLot;
public interface SpotAllocationStrategy {
    ParkingSpot getSpotForVehicle(ParkingLot parkingLot,Vehicle vehicle);
}
