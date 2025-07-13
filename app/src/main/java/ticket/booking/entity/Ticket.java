package ticket.booking.entity;
import java.util.*;

public class Ticket {

    private String tickedId ;
    private String UserId ;
    private String source;
    private String destination;
    private String dateOfTravel;

    private Train train;

    public Ticket (String tickedId, String UserId, String source, String destination, String dateOfTravel, Train train) {
        this.tickedId = tickedId;
        this.UserId = UserId;
        this.source = source;
        this.destination = destination;
        this.dateOfTravel = dateOfTravel;
        this.train = train;

    }

    public Ticket() {}

    public String getTickedId() {
        return tickedId;
    }
    public void setTickedId(String tickedId) {
        this.tickedId = tickedId;
    }
    public String getUserId() {
        return UserId;
    }
    public void setUserId(String userId) {
        this.UserId = userId;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;

    }

    public Train getTrain() {
        return train;
    }

    public void ticketInfo(){
        System.out.println("your Booked Ticket id is : " + this.tickedId);
        System.out.println("Source : " + this.source);
        System.out.println("Destination : " + this.destination);
        System.out.println("Date : " + this.dateOfTravel);
    }

}