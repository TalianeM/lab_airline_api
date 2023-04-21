package lab_airline.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;


@Entity
@Table (name = "Flights")

public class Flight {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)


@Column
private long id;


@Column
private String destination;


@Column
private int capacity;


@Column
private Date departureDate;


@Column
private Date departureTime;



@JsonIgnoreProperties ("flights")
@ManyToMany (mappedBy = "flights")

private List<Passenger> passengers;

public Flight(long id, String destination, Date departureDate, Date departureTime){
    this.destination = destination;
    this.capacity = capacity;
    this.departureDate = departureDate;
    this.departureTime = departureTime;
}

public Flight(){

}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }
}
