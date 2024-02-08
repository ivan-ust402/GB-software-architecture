package homework4;

import java.util.UUID;

public class Ticket {
    private UUID ticketId;
    private float price;
    private Event event;


    public Ticket(UUID ticketId, float price, Event event) {
        this.ticketId = ticketId;
        this.price = price;
        this.event = event;
    }

    public void showTicketDetails() {
        System.out.println("Номер билета: " + ticketId
                + "Мероприятие: " + event
                + "Стоимость: " + price);
    }
}
