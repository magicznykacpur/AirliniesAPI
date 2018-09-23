package faustit.airlinesapi.tourist;

import faustit.airlinesapi.flight.Flight;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedList;

@Table
@Entity
public class Tourist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String gender;
    private String country;
    private String[] remarks;
    private Date dateOfBirth;
    private LinkedList<Flight> listOfFlights;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String[] getRemarks() {
        return remarks;
    }

    public void setRemarks(String[] remarks) {
        this.remarks = remarks;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void addFlight(Flight flight) {
        if (!listOfFlights.contains(flight))
            listOfFlights.add(flight);
    }

    public void removeFlight(Flight flight) {
        if (listOfFlights.contains(flight))
            listOfFlights.remove(flight);
    }

    public LinkedList<Flight> getListOfFlights() {
        return listOfFlights;
    }

    public void setListOfFlights(LinkedList<Flight> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }
}
