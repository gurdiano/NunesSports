package com.gurdiano.NunesSports.configurations;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gurdiano.NunesSports.entities.Order;
import com.gurdiano.NunesSports.entities.Payment;
import com.gurdiano.NunesSports.entities.Product;
import com.gurdiano.NunesSports.entities.ShoppingCart;
import com.gurdiano.NunesSports.entities.User;
import com.gurdiano.NunesSports.repositories.OrderRepository;
import com.gurdiano.NunesSports.repositories.PaymentRepository;
import com.gurdiano.NunesSports.repositories.ProductRepository;
import com.gurdiano.NunesSports.repositories.ShoppingCartRepository;
import com.gurdiano.NunesSports.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	ProductRepository productRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	ShoppingCartRepository shoppingCartRepository;
	@Autowired
	OrderRepository orderCartRepository;
	@Autowired
	PaymentRepository paymentCartRepository;
	
	@Override
	public void run(String... args) throws Exception {
		//Product(Long id, String name, String code, String description, Double price)
		//User(Long id, String username, String password)
		//ShoppingCart(Long id, Double total, User client)
		//Order(Long id, Double total)
		//Payment(Long id, Instant date, Order order)
		
		Product p1 = new Product(null, "Raquete", "0567678", "Raquete otioma para jogos...", 150.00);
		Product p2 = new Product(null, "Bola", "0567679", "Bola otioma para jogos...", 100.00);
		Product p3 = new Product(null, "Overgrip", "0567680", "Bola otioma para jogos...", 54.90);
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		User u1 = new User(null, "Tiago Gurdiano", "1234567");
		User u2 = new User(null, "Guilherme Lima", "1234567");
		User u3= new User(null, "Savio Marinho", "1234567");
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
		
		ShoppingCart c1 = new ShoppingCart(null, u1);
		ShoppingCart c2 = new ShoppingCart(null, u2);
		ShoppingCart c3 = new ShoppingCart(null, u3);
		shoppingCartRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		Order o1 = new Order(null, c1.getTotal());
		Payment pay1 = new Payment(null, Instant.now(), o1);
		o1.setPayment(pay1);
		orderCartRepository.saveAll(Arrays.asList(o1));
		paymentCartRepository.saveAll(Arrays.asList(pay1));
		
	}
}
