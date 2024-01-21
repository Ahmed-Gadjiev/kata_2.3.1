package app.dao;

import app.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    User get(Long id);

    void delete(long id);

    void update(Long id, User newUser);

    List<User> getAll();
}
