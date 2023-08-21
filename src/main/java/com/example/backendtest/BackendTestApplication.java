package com.example.backendtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.backendtest.entities.Category;
import com.example.backendtest.repository.CategoryRepository;

@SpringBootApplication
public class BackendTestApplication implements CommandLineRunner{

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackendTestApplication.class, args);
		System.out.println("Testando 123");
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1l, "Eletronics");
		Category cat2 = new Category(2l, "Books");
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
	}

}
