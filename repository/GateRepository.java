package parkingLot.repository;

import parkingLot.exception.GateNotFoundException;
import parkingLot.models.Gate;
import parkingLot.models.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    private Map<Integer, Gate> gateMap; // table

    public GateRepository() {
        this.gateMap = new HashMap<>();
    }

    public Gate get(int gateId){
        Gate gate = gateMap.get(gateId);
        if(gate == null){
            throw new GateNotFoundException("Gate not found for id : " + gateId);
        }
        return gate;
    }

    public void put(Gate gate){
        gateMap.put(gate.getId(), gate);
        System.out.println("gate has been added successfully");
    }
}
