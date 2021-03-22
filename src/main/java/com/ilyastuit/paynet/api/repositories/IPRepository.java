package com.ilyastuit.paynet.api.repositories;

import com.ilyastuit.paynet.api.domain.IP;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IPRepository extends CrudRepository<IP, Long> {

    @Override
    List<IP> findAll();

}
