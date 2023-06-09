package lab_airline.api.models;


import jakarta.persistence.*;

import java.util.List;

@Entity (name = "Passengers")

public class Passenger {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;


    @Column
    private String name;


    @Column
    private  String emailAddress;

    public List<Flight> Flights;

    public Passenger(String name,String emailAddress){
        this.name = name;
        this.emailAddress = emailAddress;
    }

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
}
