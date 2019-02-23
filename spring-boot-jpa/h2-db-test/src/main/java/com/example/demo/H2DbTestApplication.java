package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class H2DbTestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(H2DbTestApplication.class, args);
		PersonRepository personRepository = ctx.getBean(PersonRepository.class);
		System.out.println(personRepository.findAll());
	}

}
