package com.sriahlc.sriahlcApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.sriahlc.sriahlcApp")
@SpringBootApplication
@EntityScan("com.sriahlc.sriahlcApp.*")
@EnableJpaRepositories("com.sriahlc.sriahlcApp.*")
public class SriahlcAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SriahlcAppApplication.class, args);
	}

}
