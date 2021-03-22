package com.ilyastuit.paynet.api.services.client;

import com.ilyastuit.paynet.api.domain.client.Client;
import com.ilyastuit.paynet.api.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client findClientById(Long id) {
        return clientRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Client> findAllClients() {
        return clientRepository.findAll();
    }
}
