package com.ilyastuit.paynet.api.services.ip;

import com.ilyastuit.paynet.api.domain.IP;
import com.ilyastuit.paynet.api.repositories.IPRepository;

import java.util.List;

public class IPServiceImpl implements IPService {

    private final IPRepository ipRepository;

    public IPServiceImpl(IPRepository ipRepository) {
        this.ipRepository = ipRepository;
    }

    @Override
    public IP findIPById(Long id) {
        return ipRepository.findById(id).orElseThrow();
    }

    @Override
    public List<IP> findAllIPs() {
        return ipRepository.findAll();
    }
}
