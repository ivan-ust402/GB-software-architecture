package homework4;

import java.time.LocalDateTime;
import java.util.UUID;

public class Venue {
    private UUID venueId;
    public String name;
    public String location;

    public Venue(UUID venueId, String name, String location) {
        this.venueId = venueId;
        this.name = name;
        this.location = location;
    }

    public void getVenueDetails() {
        System.out.println("Id места проведения: " + venueId
                + "Название места: " + name
                + "Местоположение: " + location);
    }
}
