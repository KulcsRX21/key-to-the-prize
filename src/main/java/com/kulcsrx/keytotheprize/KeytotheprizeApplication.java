package com.kulcsrx.keytotheprize;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kulcsrx.keytotheprize.model.User;
import com.kulcsrx.keytotheprize.model.UserRepository;

@SpringBootApplication
public class KeytotheprizeApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeytotheprizeApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			Stream.of("Peter", "Nora", "Andrew").forEach(name -> {
				User user = new User(name, name.toLowerCase() + "@domain.com");
				userRepository.save(user);
			});
		};
	}
}
