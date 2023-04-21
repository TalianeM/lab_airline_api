package lab_airline.api.services;


import lab_airline.api.models.Passenger;
import lab_airline.api.repositories.FlightRepository;
import lab_airline.api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    FlightRepository flightRepository;



}
