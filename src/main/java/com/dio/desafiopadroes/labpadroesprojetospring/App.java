package com.dio.desafiopadroes.labpadroesprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto do spring gerado pelo Spring Initalizr
 * Modulos adicionados:
 * -Spring Data JPA
 * -Spring Web
 * -H2 Database
 * -OpenFeign
 * @author guiillhe
 */

@EnableFeignClients
@SpringBootApplication

public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
