package parkingLot.models;

import parkingLot.models.enums.GateStatus;
import parkingLot.models.enums.GateType;

import java.time.LocalDateTime;

public class Gate extends BaseModel{
    private int gateNumber; // 101 -> floor 1, gate no 01
    private GateType gateType;
    private GateStatus gateStatus;
    private String operatorName;

    public Gate() {
    }

    public Gate(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, int gateNumber, GateType gateType, GateStatus gateStatus, String operatorName) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.gateNumber = gateNumber;
        this.gateType = gateType;
        this.gateStatus = gateStatus;
        this.operatorName = operatorName;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
