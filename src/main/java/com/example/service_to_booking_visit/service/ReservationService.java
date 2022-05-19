package com.example.service_to_booking_visit.service;

import com.example.service_to_booking_visit.persistance.Reservation;
import com.example.service_to_booking_visit.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final CompanyService companyService;
    private final ClientService clientService;

    public Reservation findById(Long id) {
        return reservationRepository.findById(id).orElseThrow();
    }

    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    public void deleteById(Long id) {
        reservationRepository.deleteById(id);
    }

    public void addReservationToClient(Long clientId, Reservation reservation){
        clientService.findById(clientId).getReservationList().add(reservation);
    }

    public void addReservationToCompany(Long companyId, Reservation reservation){
        companyService.findById(companyId).getCalendar().getReservationList().add(reservation);
    }



}
