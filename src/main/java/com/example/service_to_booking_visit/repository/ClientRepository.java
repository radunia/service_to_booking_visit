package com.example.service_to_booking_visit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.service_to_booking_visit.persistance.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
