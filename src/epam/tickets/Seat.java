package epam.tickets;

import java.util.Comparator;

/**
 * Created by Кирилл on 10.11.2014.
 */
public class Seat {

   // public static final Comparator PRICE_COMPARATOR = new PriceComparator();

    public enum Type{
        PARTERRE, LOGE, BALCONY
    }

    public enum Status{
        FREE, BOOKED, SOLD
    }

    //fiels
    private int id;
    private int number;
    private int numberRow;
    private Status status; //0 - null, 1 - free, 2 - reserv, 3 - sale. Save values for fieds in DB
    private Type type; //0 - партер, 1 - ложа, 2 - балкон
    private int cost;
    private Event event;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberRow() {
        return numberRow;
    }

    public void setNumberRow(int numberRow) {
        this.numberRow = numberRow;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
