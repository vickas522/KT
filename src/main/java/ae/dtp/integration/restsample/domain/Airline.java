package ae.dtp.integration.restsample.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="ALTTAB")
public class Airline {

    @Id
    @Column(name = "URNO")
    private Long id;

    @Column(name = "ALC2")
    private String iataCode;
    @Column(name = "ALC3")
    private String icaoCode;
    @Column(name = "ALFN")
    private String airlineName;


}
