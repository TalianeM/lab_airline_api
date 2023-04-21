package lab_airline.api.models;

import lab_airline.api.models.Flight;

import java.util.Date;
import java.util.List;

public class PassengerDTO {

    public long id;

    private String name;

    private  String emailAddress;

    private List<Flight> flights;

    public PassengerDTO(String name, String emailAddress, List flights){
    this.name = name;
    this.emailAddress = emailAddress;
    this.flights = flights;
    }

//    Getters & setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }


    //
}

