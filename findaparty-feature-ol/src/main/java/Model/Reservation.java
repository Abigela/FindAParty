package Model;
public class Reservation {
    public String reserveNr;
    private User userReservation;
    public String ticketNr;
    public String getReserveNr() {
        return reserveNr;
    }
    public void setReserveNr(String reserveNr) {
        this.reserveNr = reserveNr;
    }
    public User getUserReservation() {
        return userReservation;
    }
    public void setUserReservation(User userReservation) {
        this.userReservation = userReservation;
    }
    public String getTicketNr() {
        return ticketNr;
    }
    public void setTicketNr(String ticketNr) {
        this.ticketNr = ticketNr;
    }
}