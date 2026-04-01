package Service;

import Model.Club;
import Model.Events;
import Model.Location;
import Model.Reservation;
import Model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartyService {

    private List<Club> clubs;
    private List<Events> events;
    private List<Location> locations;
    private List<Reservation> reservations;
    private List<User> users;

    public PartyService() {
        clubs = new ArrayList<>();
        events = new ArrayList<>();
        locations = new ArrayList<>();
        reservations = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void createClub(Club club) {
        clubs.add(club);
    }

    public void createEvent(Events event) {
        events.add(event);
    }

    public void createLocation(Location location) {
        locations.add(location);
    }

    public void createReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void createUser(User user) {
        users.add(user);
    }

    // Metoda të tjera për manipulimin e të dhënave

    public List<Club> getAllClubs() {
        return clubs;
    }

    public List<Events> getAllEvents() {
        return events;
    }

    public List<Location> getAllLocations() {
        return locations;
    }

    public List<Reservation> getAllReservations() {
        return reservations;
    }

    public List<User> getAllUsers() {
        return users;
    }
}
