package com.example.webcourse.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.webcourse.entities.Order;
import com.example.webcourse.entities.User;
import com.example.webcourse.repositories.OrderRepository;
import com.example.webcourse.repositories.UserRepository;

@Configuration

public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Joao", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Julio Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Tito Pirulito", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1); 
		
		userRepository.saveAll(Arrays.asList(u1,u2, u3));
		
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
	}

}
