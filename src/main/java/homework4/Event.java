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

    /**
     * метод получения инфо о событии
     * */
    public void getDetails() {
        System.out.println("Id мероприятия: " + eventId
                + "Дата мероприятия: " + date
                + "Место проведения: " + venue
                + "Число доступных билетов: " + ticketsAvailable);
    }

    /**
     * метод изменения места проведения мероприятия
     * */
    public boolean changeVenue(String name, String location, VenueProvider provider) {
        return true;
    }

    /**
     * метод выбора места проведения мероприятия
     * */
    public boolean chooseVenue(String name, String location, VenueProvider provider) {
        return true;
    }

    /**
     * метод изменения количества доступных билетов
     * */
    public boolean changeCountAvailableTickets() {
        return true;
    }
}
