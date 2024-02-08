package homework4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

import static java.util.UUID.randomUUID;

public class VenueProvider {
    private ArrayList<Venue> venues;
    public Venue addVenue(String name, String location) {
        Venue newVenue = new Venue(randomUUID(), name, location);
        venues.add(newVenue);
        return newVenue;
    }

    public ArrayList<Venue> getVenues() {
        return venues;
    }

    /**
     * метод получения места проведения мероприятия
     * */
    public Venue getVenue(String name, String location) {
        for (Venue item : venues) {
            if (Objects.equals(item.name, name) && Objects.equals(item.location, location)) {
                return item;
            }
        }
        return null;
    }
}
