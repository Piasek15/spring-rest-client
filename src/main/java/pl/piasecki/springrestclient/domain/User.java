package pl.piasecki.springrestclient.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {

    private Integer id;
    private String gender;
    private Name name;
    private Location location;
    private String email;
    private Login login;
    private String phone;
    private Job job;
    private Billing billing;
    private String language;
    private String currency;
}
