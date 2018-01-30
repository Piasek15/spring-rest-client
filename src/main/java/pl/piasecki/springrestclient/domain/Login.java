package pl.piasecki.springrestclient.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Login {
    private String username;
    private String password;
    private String md5;
    private String sha1;
    private String sha256;
}
