package parkingLot.models;

import java.time.LocalDateTime;

public class Ticket extends BaseModel{
    private LocalDateTime entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Gate entryGate;

    public Ticket() {
    }

    public Ticket(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, LocalDateTime entryTime, Vehicle vehicle, ParkingSpot parkingSpot, Gate entryGate) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryGate = entryGate;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }
}
