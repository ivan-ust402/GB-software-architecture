package homework4;

import java.util.ArrayList;
import java.util.UUID;

import static java.util.UUID.randomUUID;

public class TicketProvider {
    private ArrayList<Ticket> tickets;

    /**
     * метод получения массива билетов
     * */
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    /**
     * метод продажи и покупки билета
     * */
    public Ticket sellTicket(Event event,
                             Customer customer,
                             CashProvider cashProvider) {
        return new Ticket(randomUUID(), 10000, event);
    }

    /**
     * метод обновления статуса билета
     * */
    public boolean updateTicketStatus(Ticket ticket) {
        return true;
    }
}
