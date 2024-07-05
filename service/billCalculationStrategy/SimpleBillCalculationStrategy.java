package parkingLot.service.billCalculationStrategy;

import parkingLot.models.Bill;
import parkingLot.models.Ticket;
import parkingLot.models.enums.BillStatus;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
public class SimpleBillCalculationStrategy implements BillCalculationStrategy{


    @Override
    public Bill generateBill(Ticket ticket) {
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();
        long numberOfSeconds = ChronoUnit.SECONDS.between(exitTime, entryTime);
        long amount = numberOfSeconds;
        Bill bill = new Bill();
        bill.setAmount(amount);
        bill.setTicket(ticket);
        bill.setExitTime(exitTime);
        bill.setId(exitTime.hashCode());
        bill.setStatus(BillStatus.UNPAID);
        return bill;
    }
}
