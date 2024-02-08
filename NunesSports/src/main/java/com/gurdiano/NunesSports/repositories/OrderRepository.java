package com.gurdiano.NunesSports.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gurdiano.NunesSports.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
