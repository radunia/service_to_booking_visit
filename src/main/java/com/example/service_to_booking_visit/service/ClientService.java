package com.example.service_to_booking_visit.service;

import com.example.service_to_booking_visit.persistance.Client;
import com.example.service_to_booking_visit.persistance.Reservation;
import com.example.service_to_booking_visit.repository.ClientRepository;
import lombok.RequiredArgsConstructor;


import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;
    private final ReservationService reservationService;

    public Client findById(Long id) {
        return clientRepository.findById(id).orElseThrow();
    }

    public Client save(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public void deleteById(Long id) {
        clientRepository.deleteById(id);
    }

//    public void bookVisit(Long clientId, Reservation reservation, Long companyId){
//        reservationService.addReservationToClient(clientId, reservation);
//        reservationService.addReservationToCompany(companyId, reservation);
//        reservationService.save(reservation);
//    }
}
