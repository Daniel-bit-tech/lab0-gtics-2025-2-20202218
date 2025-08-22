package com.pucp.LAB020252;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Lab020252Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab020252Application.class, args);
		System.out.println("Hola Mundo");
		List<String> list = List.of("Elemento 1", "Elemento 2", "Elemento 3") ;
		for (String s : list) {
			System.out.println("Elemento " +s);
		}
	}

}
