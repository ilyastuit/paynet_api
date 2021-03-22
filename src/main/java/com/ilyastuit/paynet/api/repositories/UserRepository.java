package com.ilyastuit.paynet.api.repositories;

import com.ilyastuit.paynet.api.domain.user.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    @Override
    List<User> findAll();

}
