package pl.piasecki.springrestclient.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Job {
    private String title;
    private String company;
}
