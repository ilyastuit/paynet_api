package com.ilyastuit.paynet.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ilyastuit.paynet.api.domain.IP;

public interface IPRepository extends JpaRepository<IP, Long> {
}
