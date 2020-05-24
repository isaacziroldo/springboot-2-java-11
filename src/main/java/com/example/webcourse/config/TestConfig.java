package com.example.webcourse.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.webcourse.entities.User;
import com.example.webcourse.repositories.UserRepository;

@Configuration

public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Joao", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Julio Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Tito Pirulito", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2, u3));
		
	}

}
