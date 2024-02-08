package com.gurdiano.NunesSports.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gurdiano.NunesSports.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
