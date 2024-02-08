package com.gurdiano.NunesSports.configurations;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gurdiano.NunesSports.entities.Product;
import com.gurdiano.NunesSports.repositories.ProductRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		//public Product(Long id, String name, String code, String description, Double price)
		
		Product p1 = new Product(null, "Raquete", "0567678", "raquete otioma para jogos...", 120.00);
		productRepository.saveAll(Arrays.asList(p1));
		
	}
}
