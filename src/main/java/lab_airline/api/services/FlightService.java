package lab_airline.api.services;

import lab_airline.api.models.Flight;
import lab_airline.api.repositories.FlightRepository;
import org.springframework.stereotype.Service;
@Service

public class FlightService {

    FlightRepository flightRepository;


    public Flight addNewFlight(Flight flight){                   // Add details of new Flight
        flightRepository.save(flight);
        return flight;
    }

//     

}
