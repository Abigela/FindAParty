package Model;
import java.util.Date;
public class Events {
    public String eventId;
    public String eventName;
    public Date eventTime;
    public float price;
    public Club reference;
    public String getEventId() {
        return eventId;
    }
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public Date getEventTime() {
        return eventTime;
    }
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public Club getReference() {
        return reference;
    }
    public void setReference(Club reference) {
        this.reference = reference;
    }
}