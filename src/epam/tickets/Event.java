package epam.tickets;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by Кирилл on 10.11.2014.
 */
public class Event {
    //fields
    private int id;
    private String name;
    private String address; //
    private Date date;
    private LocalDateTime dateTime;
    private List<Seat> seatList;
    private boolean active;

    public Event(){
    }

    public Event(int id){
        this.id = id;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public List<Seat> getSeatListFree(){
        List<Seat> SeatLeaistFree = new ArrayList<Seat>();
        for(Seat seat : seatList){
            if (seat.getStatus() == Seat.Status.FREE){
                SeatLeaistFree.add(seat);
            }
        }
      //  Collections.sort(SeatLeaistFree, Seat.PRICE_COMPARATOR);
        return SeatLeaistFree;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
