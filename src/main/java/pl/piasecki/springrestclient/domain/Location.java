package pl.piasecki.springrestclient.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Location {

    private String street;
    private String city;
    private String state;
    private String postCode;
}
