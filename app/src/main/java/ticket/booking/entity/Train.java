package ticket.booking.entity;

import java.util.*;

public class Train {
    private String TrainId;
    private Integer trainNo;
    private String TrainName;
    private List<List<Integer>> seats;

    private Map<String,String> stationsTime;

    private List<String> stations;
    public Train() {}

    public Train(String TrainId, Integer trainNo, String TrainName) {
        this.TrainId = TrainId;
        this.trainNo = trainNo;
        this.TrainName = TrainName;
        this.stations = new ArrayList<>();
        this.stationsTime = new HashMap<>();
        this.stations.add("khi");
        this.stations.add("hyd");
        this.stations.add("lhr");
        this.stationsTime.put("khi", "13:50:00");
        this.stationsTime.put("hyd", "15:50:00");
        this.stationsTime.put("lhr", "23:50:00");
    }

    public Integer getTrainNo() {
        return trainNo;
    }

    public String getTrainId() {
        return TrainId;
    }

    public void setTrainId(String trainId) {
       this.TrainId = trainId;
    }

    public void setTrainNo(Integer trainNo) {
        this.trainNo = trainNo;
    }
    public String getTrainName() {
        return TrainName;
    }
    public void setTrainName(String trainName) {
        this.TrainName = trainName;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    public Map<String, String> getStationsTime() {
        return stationsTime;
    }
    public void setStationsTime(Map<String, String> stationsTime) {
        this.stationsTime = stationsTime;
    }
    public List<String> getStations() {
        return stations;
    }
    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public void trainInfo(){
        System.out.println("Train Id : " + this.TrainId);
        System.out.println("Train Name : " + this.TrainName);
        System.out.println("Train No : " + this.trainNo);
    }

}
