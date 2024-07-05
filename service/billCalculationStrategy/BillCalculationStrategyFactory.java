package parkingLot.service.billCalculationStrategy;

import parkingLot.models.Ticket;

public class BillCalculationStrategyFactory {

    public static BillCalculationStrategy getBill(){
        return new SimpleBillCalculationStrategy();
    }
}
