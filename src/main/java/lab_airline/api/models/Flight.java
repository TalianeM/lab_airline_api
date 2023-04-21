package com.bnta.models;

import java.util.Date;

public class Flight {


private long id;

private String destination;

private int capacity;

private Date departureDate;

private Date departureTime;

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
