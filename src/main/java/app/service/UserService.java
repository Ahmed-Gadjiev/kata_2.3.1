package app.service;

import app.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    User get(long id);

    void delete(long id);

    void update(Long id, User newUser);

    List<User> getAll();
}
