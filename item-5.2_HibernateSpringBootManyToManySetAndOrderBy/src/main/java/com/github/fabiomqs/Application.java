package com.github.fabiomqs;

import com.github.fabiomqs.service.BookstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Autowired
	private BookstoreService bookstoreService;



	@Bean
	public ApplicationRunner init() {
		return args -> {
			bookstoreService.fetchAuthorsOfBook();
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
