package parkingLot.models;

import java.time.LocalDateTime;

import parkingLot.models.enums.VehicleType;


public class Vehicle extends BaseModel{
    private String vehicleNumber;
    private VehicleType vehicleType;
    private String color;

    public Vehicle() {
    }

    public Vehicle(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, String vehicleNumber, VehicleType vehicleType, String color) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.color = color;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
