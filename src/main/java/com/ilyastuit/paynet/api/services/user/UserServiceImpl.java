package com.ilyastuit.paynet.api.services.user;

import com.ilyastuit.paynet.api.domain.user.User;
import com.ilyastuit.paynet.api.repositories.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
