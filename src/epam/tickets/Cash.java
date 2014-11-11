package epam.tickets;

/**
 * Created by Кирилл on 10.11.2014.
 */
public class Cash {
    private int event;
    private Integer ticketAmountSale;
    private Integer ticketAmountReserv;

    public Integer getTicketAmountSale() {
        return ticketAmountSale;
    }
    public void setTicketAmountSale(Integer ticketAmountSale) {
        this.ticketAmountSale = ticketAmountSale;
    }

    public Integer getTicketAmountReserv() {
        return ticketAmountReserv;
    }
    public void setTicketAmountReserv(Integer ticketAmountReserv) {
        this.ticketAmountReserv = ticketAmountReserv;
    }
}
