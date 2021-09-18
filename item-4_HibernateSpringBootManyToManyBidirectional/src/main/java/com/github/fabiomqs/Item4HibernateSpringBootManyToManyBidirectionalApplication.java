package com.github.fabiomqs;

import com.github.fabiomqs.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Item4HibernateSpringBootManyToManyBidirectionalApplication {

	private final BookstoreService bookstoreService;

	public Item4HibernateSpringBootManyToManyBidirectionalApplication(BookstoreService bookstoreService) {
		this.bookstoreService = bookstoreService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Item4HibernateSpringBootManyToManyBidirectionalApplication.class, args);
	}

	@Bean
	public ApplicationRunner init() {
		return args -> {
			bookstoreService.insertAuthorsWithBooks();
		};
	}

}
