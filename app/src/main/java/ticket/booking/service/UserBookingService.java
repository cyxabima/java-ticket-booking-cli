package ticket.booking.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entity.Train;
import ticket.booking.entity.User;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserBookingService {

    private User user;
    private List<User> userList;
    private ObjectMapper objectMapper = new ObjectMapper();
    private static final String filePath = "app/src/main/java/ticket/booking/localDb/users.json";

    public UserBookingService(User user) throws IOException {
        this.user = user;
        File users = new File(filePath);
        this.userList = objectMapper.readValue(users, new TypeReference<List<User>>() {});
    }

    public Boolean LoginUser(){
        Optional<User> foundUser = this.userList.stream().filter(user1 -> {
            return user1.getUserName().equals(this.user.getUserName()) && UserServiceUtil.checkPassword(this.user.getPassword(),user1.getPassword());
        }).findFirst();
        return foundUser.isPresent();
    }

    public Boolean signUp(User user){
        try{
            this.userList.add(user);
            saveUserListToFile();
            return Boolean.TRUE;
        }catch (IOException ex){
            return Boolean.FALSE;
        }
    }

    public void saveUserListToFile() throws IOException {
        File file = new File(filePath);
        objectMapper.writeValue(file, this.userList);
    }

    public Boolean makeBooking(Train train){
      return  true;
    }

    public void fetchBooking(){
        user.printTickets();
    }

    public Boolean cancelBooking(String ticketId){
      // TODO : make this function
      return true;
    }
}
