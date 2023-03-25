package com.autoRent.AutoRenting.services;

import com.autoRent.AutoRenting.models.Transport;

import java.util.List;
import java.util.Optional;

public interface TransportService {

    Transport save(Transport transport);

    List<Transport> getAllTransport();

    Transport getTransportById(Long id);
}
