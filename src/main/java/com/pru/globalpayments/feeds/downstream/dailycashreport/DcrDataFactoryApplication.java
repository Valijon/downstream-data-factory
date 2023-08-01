package com.pru.globalpayments.feeds.downstream.dailycashreport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DcrDataFactoryApplication {

	public static void main(String[] args) {
		System.out.println("DcrDataFactoryApplication running...");
		SpringApplication.run(DcrDataFactoryApplication.class, args);
	}
}
