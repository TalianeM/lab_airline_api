package lab_airline.api.services;

import lab_airline.api.models.Flight;
import lab_airline.api.repositories.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class FlightService {

    FlightRepository flightRepository;

    // Add details of new Flight
    public Flight addNewFlight(Flight flight) {
        flightRepository.save(flight);
        return flight;
    }

    //     Display all available flights
    public Optional<Flight> ShowAllFlights(long id) {
        return flightRepository.findById(id);
    }
//
//    //    details of specific flight
//    public Flight showSpecificFlight(long id){
//        flightRepository.findOne()
//    }
//
////    cancel Flight
//
//    public Flight cancelFlight (Flight flight){
//        flightRepository.deleteById();
//        return
//    }


}
