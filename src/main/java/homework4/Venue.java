package homework4;

public class Venue {
    private int venueId;
    private String name;
    private String location;

    public Venue(int venueId, String name, String location) {
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
