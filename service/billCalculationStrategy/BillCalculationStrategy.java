package parkingLot.service.billCalculationStrategy;

import parkingLot.models.Bill;
import parkingLot.models.Ticket;

public interface BillCalculationStrategy {
    Bill generateBill(Ticket ticket);
}
