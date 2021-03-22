package com.ilyastuit.paynet.api.services.ip;

import com.ilyastuit.paynet.api.domain.IP;

import java.util.List;

public interface IPService {

    IP findIPById(Long id);

    List<IP> findAllIPs();
}
