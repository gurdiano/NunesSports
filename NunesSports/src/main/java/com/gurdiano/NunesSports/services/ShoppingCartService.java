package com.gurdiano.NunesSports.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gurdiano.NunesSports.repositories.OrderRepository;

@Service
public class ShoppingCartService {
	
	@Autowired
	OrderRepository repository;
}
