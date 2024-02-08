package homework4;

import java.util.Date;

public class Event {
    private int eventId;
    private Date date;
    private Venue venue;
    private int ticketsAvailable;


    public Event(int eventId, Date date, Venue venue, int ticketsAvailable) {
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
