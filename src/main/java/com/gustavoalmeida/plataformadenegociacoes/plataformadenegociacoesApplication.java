package com.gustavoalmeida.plataformadenegociacoes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class plataformadenegociacoesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(plataformadenegociacoesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Primeiro projeto Spring sem Web");
	}
}
