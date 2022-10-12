package ru.javamentor.SpringBoot_311.service;


import ru.javamentor.SpringBoot_311.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    void update(long id, User updatedUser);
    void delete(long id);
    User getUserById (long id);
}
