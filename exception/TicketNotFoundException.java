package parkingLot.exception;

import jdk.jshell.spi.ExecutionControl;

public class TicketNotFoundException extends RuntimeException {
    public TicketNotFoundException() {
    }

    public TicketNotFoundException(String message) {
        super(message);
    }
}
