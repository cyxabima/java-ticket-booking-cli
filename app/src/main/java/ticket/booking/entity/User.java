package ticket.booking.entity;

import org.mindrot.jbcrypt.BCrypt;
import ticket.booking.service.UserServiceUtil;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String userName;
    private List<Ticket> tickets;
    private String password;
    private String hashedPassword;

    public User(String userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.tickets = new ArrayList<>();
        this.password = password;
        this.hashedPassword = UserServiceUtil.hashPassword(password);
    }

    public User(){}


    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }
    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public void  printTickets(){
        for(Ticket ticket:tickets){
            ticket.ticketInfo();
            ticket.getTrain().trainInfo();

        }
    }


}
