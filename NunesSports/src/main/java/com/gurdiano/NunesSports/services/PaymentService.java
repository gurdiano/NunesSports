package com.gurdiano.NunesSports.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gurdiano.NunesSports.repositories.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	PaymentRepository repository;
}
