package pl.piasecki.springrestclient.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class Billing {
    private class Card{
        private String type;
        private Integer number;
        private class ExpirationDate{
            private Date date;
            private String timezoneType;
            private String timezone;
        }
        private String iban;
        private String swift;
    }


}
