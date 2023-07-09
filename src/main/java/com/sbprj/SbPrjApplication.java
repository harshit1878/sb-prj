package com.sbprj;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbPrjApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SbPrjApplication.class, args);
	}
	public void run(String[] args) {
		System.out.println("Hi Every One");
	}
}
