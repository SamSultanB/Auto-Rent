package com.autoRent.AutoRenting.services.serviceImpl;

import com.autoRent.AutoRenting.models.Transport;
import com.autoRent.AutoRenting.repositories.TransportRepository;
import com.autoRent.AutoRenting.services.TransportService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportServiceImpl implements TransportService {

    private TransportRepository transportRepository;

    public TransportServiceImpl(TransportRepository transportRepository){
        this.transportRepository = transportRepository;
    }

    @Override
    public void save(Transport transport) {
        transportRepository.save(transport);
    }

    @Override
    public void delete(Long id) {
        transportRepository.deleteById(id);
    }

    @Override
    public List<Transport> getAllTransport() {
        return transportRepository.findAll();
    }

    @Override
    public Transport getTransportById(Long id) {
        return transportRepository.getReferenceById(id);
    }
}
