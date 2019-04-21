package it.discovery;

import it.discovery.client.SaveBooksClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RestApplication {
	public static void main(String[] args) {
		SpringApplication.run(
				RestApplication.class, args);


		SaveBooksClient saveBooksClient = new SaveBooksClient();
		saveBooksClient.saveBooks();
	}
}
