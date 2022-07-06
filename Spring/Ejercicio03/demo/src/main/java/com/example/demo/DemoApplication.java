package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		IPerroRepository repository = context.getBean(IPerroRepository.class);

		Perro tony = new Perro("Tony", "Labrador", "Marrón");

		repository.save(tony);

		System.out.println("Find");
		System.out.println(repository.count());

		System.out.println("Mi perro se llama " + repository.findAll().get(0).getNombre());
	}
}
