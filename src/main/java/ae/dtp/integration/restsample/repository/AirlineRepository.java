package ae.dtp.integration.restsample.repository;

import ae.dtp.integration.restsample.domain.Airline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  AirlineRepository extends JpaRepository<Airline,Long>{

    Airline getByIataCode(String airlinecode);


}
