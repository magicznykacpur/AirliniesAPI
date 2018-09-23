package faustit.airlinesapi.flight;

import faustit.airlinesapi.tourist.Tourist;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.LinkedList;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date departureDateTime;
    private Date arrivalDateTime;
    private long numberOfSeats;
    private double ticketPrice;
    private LinkedList<Tourist> listOfTourists;

//    public Flight(Date departureDateTime, Date arrivalDateTime, long numberOfSeats, double ticketPrice) {
//        this.departureDateTime = departureDateTime;
//        this.arrivalDateTime = arrivalDateTime;
//        this.numberOfSeats = numberOfSeats;
//        this.ticketPrice = ticketPrice;
//        this.listOfTourists = new LinkedList<>();
//    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(Date departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public Date getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(Date arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public long getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(long numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void addTouristToFlight(Tourist tourist) {
        if (!listOfTourists.contains(tourist))
            listOfTourists.add(tourist);
    }

    public void removeTouristFromFlight(Tourist tourist) {
        if (listOfTourists.contains(tourist))
            listOfTourists.remove(tourist);
    }

    public LinkedList<Tourist> getListOfTourists() {
        return listOfTourists;
    }

    public void setListOfTourists(LinkedList<Tourist> listOfTourists) {
        this.listOfTourists = listOfTourists;
    }
}