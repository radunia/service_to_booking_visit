package com.example.service_to_booking_visit.repository;

import com.example.service_to_booking_visit.persistance.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
