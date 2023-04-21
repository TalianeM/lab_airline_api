package lab_airline.api.repositories;


import lab_airline.api.models.Flight;
import lab_airline.api.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

}
