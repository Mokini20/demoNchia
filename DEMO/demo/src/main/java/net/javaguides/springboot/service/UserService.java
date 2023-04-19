package net.javaguides.springboot.service;

import org.apache.catalina.User;

import java.util.List;
public interface UserService {
    User createUser(User user);
    User getUserById(Long userId);
    List<net.javaguides.springboot.entity.user> getAllUsers();

    net.javaguides.springboot.entity.user updateUser();

    net.javaguides.springboot.entity.user updateUser(User user);
    void deleteUser(Long userId);
}
