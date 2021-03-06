package com.github.fabiomqs;

import com.github.fabiomqs.service.BookstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Item5HibernateSpringBootManyToManyBidirectionalListVsSetApplication {

	@Autowired
	private BookstoreService bookstoreService;

	public static void main(String[] args) {
		SpringApplication.run(Item5HibernateSpringBootManyToManyBidirectionalListVsSetApplication.class, args);
	}

	@Bean
	public ApplicationRunner init() {
		return args -> {
			System.out.println("===================================================");
			System.out.println("Populate database and remove a book (List case) ...");
			System.out.println("===================================================");
			bookstoreService.persistAuthorWithBooksAndRemoveOneBookList();

			System.out.println("\n");
			System.out.println("==================================================");
			System.out.println("Populate database and remove a book (Set case) ...");
			System.out.println("==================================================");
			bookstoreService.persistAuthorWithBooksAndRemoveOneBookSet();
		};
	}

}
