package com.example.bth11;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bth11.entity.Role;
import com.example.bth11.repository.RoleRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner run(RoleRepository roleRepository) {
		return args -> {
			if (roleRepository.findByName("ADMIN").isEmpty()) {
				roleRepository.save(new Role(null, "ADMIN"));
			}
			if (roleRepository.findByName("USER").isEmpty()) {
				roleRepository.save(new Role(null, "USER"));
			}

		};
	}

}
