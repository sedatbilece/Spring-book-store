package com.FirstApp.bookstore;

import com.FirstApp.bookstore.model.Book;
import com.FirstApp.bookstore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {


	private final BookRepository bookRepository;

	public BookStoreApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Book book1 = Book.builder().name("Yuzuklerin efendisi").author("J.R.R Tolkien").price(10.0).stock(16).build();
		Book book2 = Book.builder().name("Ben Robot").author("Isac Asimov").price(7.9).stock(20).build();
		Book book3 = Book.builder().name("Baslangic").author("Dan Brown	").price(20.0).stock(45).build();

		bookRepository.saveAll(Arrays.asList(book1,book2,book3));
	}
}
