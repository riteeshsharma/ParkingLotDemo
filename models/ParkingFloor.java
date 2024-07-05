package parkingLot.models;

import parkingLot.models.enums.ParkingFloorStatus;

import java.time.LocalDateTime;

import java.util.List;
public class ParkingFloor extends BaseModel{
    private int floorNumber;
    private List<ParkingSpot> parkingSpots;
    private Gate entryGate;
    private Gate exitGate;
    private ParkingFloorStatus parkingFloorStatus;

    public ParkingFloor() {
    }

    public ParkingFloor(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, int floorNumber, List<ParkingSpot> parkingSpots, Gate entryGate, Gate exitGate, ParkingFloorStatus parkingFloorStatus) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.floorNumber = floorNumber;
        this.parkingSpots = parkingSpots;
        this.entryGate = entryGate;
        this.exitGate = exitGate;
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
}
