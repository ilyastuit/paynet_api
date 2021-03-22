package com.ilyastuit.paynet.api.repositories;

import com.ilyastuit.paynet.api.domain.client.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
