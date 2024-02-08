package homework4;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

import static java.util.UUID.randomUUID;

public class EventProvider {
    private ArrayList<Event> events;

    /**
     * метод создания мероприятия
     * */
    public Event createEvent(String name, Date date, Venue venue, int ticketsAvailable) {
        Event newEvent = new Event(randomUUID(), date, venue, ticketsAvailable);
        events.add(newEvent);
        return newEvent;
    }

    /**
     * метод получения всех существующих мероприятий
     * */
    public ArrayList<Event> getEvents() {
        return events;
    }

    /**
     * метод получения мероприятия
     * */
    public Event getEvent(Date date, Venue venue) {
        for (Event item : events) {
            if (Objects.equals(item.date, date)
                    && Objects.equals(item.venue.name, venue.name)
                    && Objects.equals(item.venue.location, venue.location)) {
                return item;
            }
        }
        return null;
    }
}

