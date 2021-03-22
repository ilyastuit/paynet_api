package com.ilyastuit.paynet.api.repositories;

import com.ilyastuit.paynet.api.domain.client.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Long> {

    @Override
    List<Client> findAll();

}
