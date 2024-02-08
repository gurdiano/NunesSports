package com.gurdiano.NunesSports.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gurdiano.NunesSports.repositories.UserRepository;

@Service
public class OrderService {
	
	@Autowired
	UserRepository repository;
}
