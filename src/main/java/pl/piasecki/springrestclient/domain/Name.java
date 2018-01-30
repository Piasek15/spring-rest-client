package pl.piasecki.springrestclient.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Name {

    private String title;
    private String first;
    private String last;
}
