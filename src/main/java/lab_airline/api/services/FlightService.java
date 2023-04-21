package lab_airline.api.services;

import jakarta.persistence.Id;
import lab_airline.api.models.Flight;
import lab_airline.api.repositories.FlightRepository;
import org.springframework.stereotype.Service;
@Service

public class FlightService {

    FlightRepository flightRepository;


    public Flight addNewFlight(Flight flight) {                   // Add details of new Flight
        flightRepository.save(flight);
        return flight;
    }

    public Flight ShowAllFlights(long id) {                 //     Display all available flights
        flightRepository.findById(id);
    }


    public Flight showSpecificFlight(long id){             //    details of specific flight
        flightRepository.findOne()
    }

//    cancel Flight

    public Flight cancelFlight (Flight flight){
        
    }

}
