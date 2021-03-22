package com.ilyastuit.paynet.api.services.client;

import com.ilyastuit.paynet.api.domain.client.Client;

import java.util.List;

public interface ClientService {

    Client findClientById(Long id);

    List<Client> findAllClients();
}
