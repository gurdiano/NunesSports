package com.gurdiano.NunesSports.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gurdiano.NunesSports.entities.Product;
import com.gurdiano.NunesSports.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductResource {
	
	@Autowired
	ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}