package com.autoRent.AutoRenting.services;

import com.autoRent.AutoRenting.models.Transport;

import java.util.List;
import java.util.Optional;

public interface TransportService {

    void save(Transport transport);

    void delete(Long id);

    List<Transport> getAllTransport();

    Transport getTransportById(Long id);



}
