package ae.dtp.integration.restsample.controller.web;


import ae.dtp.integration.restsample.domain.Airline;
import ae.dtp.integration.restsample.repository.AirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
 @Autowired
 private  AirlineRepository  airlinerepo;

@PostMapping("/Gethelloworld" )

    public  Airline heloWorld(@RequestBody Airline airline)
    {
        return airline ;
    }

    @PostMapping("/airlinename")
    public  Airline getAirlineNames(@RequestBody Airline airline)
    {

    //    return airlinerepo.getByIataCode(airline.getIataCode()) ;
        return airlinerepo.save(airline);

    }
}
