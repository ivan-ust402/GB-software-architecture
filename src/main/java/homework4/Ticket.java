package homework4;

public class Ticket {
    private int ticketId;
    private float price;
    private Event event;


    public Ticket(int ticketId, float price, Event event) {
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
