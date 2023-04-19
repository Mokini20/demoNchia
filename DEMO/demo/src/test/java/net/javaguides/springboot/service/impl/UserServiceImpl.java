package net.javaguides.springboot.service.impl;


import lombok.AllArgsConstructor;
import net.javaguides.springboot.entity.user;
import net.javaguides.springboot.repository.UserRepository;
import net.javaguides.springboot.service.UserService;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service

@AllArgsConstructor

public abstract class UserServiceImpl implements UserService {


    private UserRepository userRepository;



    @Override

    public User createUser(User user) {




    }



    @Override

    public User getUserById(Long userId) {

        Optional<user> optionalUser = userRepository.findById(userId);

        return (User) optionalUser.get();

    }

    /**
     * @param user
     * @return
     */



    public User user ;
    UserServiceImpl(User user) {

        net.javaguides.springboot.entity.user existingUser;
        existingUser = userRepository.findById(Long.valueOf(user.getFullName())).get();

        existingUser.setFirstName(user.getName());

        existingUser.setLastName(user.getName());

        existingUser.setEmail(user.getName());

        net.javaguides.springboot.entity.user updatedUser = userRepository.save(existingUser);

    }

    private net.javaguides.springboot.entity.user updatedUser(User user) {
        return null;
    }


    @Override

    public void deleteUser(Long userId) {

        userRepository.deleteById(userId);

    }}
