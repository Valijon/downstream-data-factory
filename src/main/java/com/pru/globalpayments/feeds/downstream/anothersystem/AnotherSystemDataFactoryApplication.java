package com.pru.globalpayments.feeds.downstream.anothersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnotherSystemDataFactoryApplication {

	public static void main(String[] args) {		
		System.out.println("AnotherSystemDataFactoryApplication running...");
		SpringApplication.run(AnotherSystemDataFactoryApplication.class, args);
	}
}
