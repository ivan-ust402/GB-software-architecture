package homework4;

import java.util.Date;
import java.util.UUID;

public class Event {
    private UUID eventId;
    public Date date;
    public Venue venue;
    private int ticketsAvailable;


    public Event(UUID eventId, Date date, Venue venue, int ticketsAvailable) {
        this.eventId = eventId;
        this.date = date;
        this.venue = venue;
        this.ticketsAvailable = ticketsAvailable;
    }

    public void getDetails() {
        System.out.println("Id мероприятия: " + eventId
                + "Дата мероприятия: " + date
                + "Место проведения: " + venue
                + "Число доступных билетов: " + ticketsAvailable);
    }
}
