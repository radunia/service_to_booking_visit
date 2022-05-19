package com.example.service_to_booking_visit.repository;

import com.example.service_to_booking_visit.persistance.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
