package homework4;

import java.util.ArrayList;
import java.util.UUID;

public class Customer {
    private UUID customerId;
    private String name;

    private String email;
    private ArrayList<Ticket> tickets;
    private CashProvider cashProvider;


    public Customer(UUID customerId,
                    String name, String email,
                    ArrayList<Ticket> tickets) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.tickets = tickets;
        this.cashProvider = new CashProvider();
    }

    public boolean buyTicket(Event event, TicketProvider ticketProvider) {
        return true;
    }

    public boolean repealTicket(Ticket ticket) {
        return true;
    }

    public ArrayList<Ticket> repealTicket(int ticketId) {
        return new ArrayList<Ticket>();
    }
}
