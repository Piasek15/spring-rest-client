package pl.piasecki.springrestclient.services;

import pl.piasecki.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
