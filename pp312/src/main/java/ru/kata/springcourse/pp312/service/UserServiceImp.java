package ru.kata.springcourse.pp312.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.springcourse.pp312.dao.UserDao;
import ru.kata.springcourse.pp312.model.User;


import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
    @Transactional
    @Override
    public void addNewUser(User user) {
        userDao.addNewUser(user);
    }

    @Override
    public User findUserById(long id) {
        User user = userDao.findUserById(id);
        return user;
    }

    @Transactional
    @Override
    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }

    @Transactional
    @Override
    public void updateUser(User user, long id) {
        userDao.updateUser(user,id);
    }
}
