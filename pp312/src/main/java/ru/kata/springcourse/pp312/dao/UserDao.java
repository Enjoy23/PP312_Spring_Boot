package ru.kata.springcourse.pp312.dao;



import ru.kata.springcourse.pp312.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    void addNewUser(User user);

    User findUserById(long id);

    void deleteUser(long id);

    void updateUser(User user,long id);
}
