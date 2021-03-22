package com.ilyastuit.paynet.api.services.user;

import com.ilyastuit.paynet.api.domain.user.User;

import java.util.List;

public interface UserService {

    User findUserById(Long id);

    List<User> findAllUsers();
}
