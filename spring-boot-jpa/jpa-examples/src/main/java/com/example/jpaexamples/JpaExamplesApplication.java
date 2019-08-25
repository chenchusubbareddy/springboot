package com.example.jpaexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.jpaexamples.entity.Product;
import com.example.jpaexamples.repo.ProductRepo;

@SpringBootApplication
public class JpaExamplesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(JpaExamplesApplication.class, args);
		ProductRepo pr = ctx.getBean(ProductRepo.class);
		pr.save(new Product(1, "mobile", "vivo mobile", 23000.00));
	}

}
