package homework4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

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
}
