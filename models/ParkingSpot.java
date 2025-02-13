package parkingLot.models;

import java.time.LocalDateTime;

import parkingLot.models.enums.ParkingSpotStatus;
import parkingLot.models.enums.VehicleType;

public class ParkingSpot extends BaseModel{
    private int number;
    private VehicleType vehicleType;
    private ParkingSpotStatus parkingSpotStatus;
    private Vehicle vehicle;

    public ParkingSpot() {
    }

    public ParkingSpot(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, int number, VehicleType vehicleType, ParkingSpotStatus parkingSpotStatus, Vehicle vehicle) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.number = number;
        this.vehicleType = vehicleType;
        this.parkingSpotStatus = parkingSpotStatus;
        this.vehicle = vehicle;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
