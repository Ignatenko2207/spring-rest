package it.discovery.client;

import it.discovery.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

public class SaveBooksClient {

    private final RestTemplate restTemplate;

    public SaveBooksClient() {
        restTemplate = new RestTemplate();
        restTemplate.setUriTemplateHandler(
                new DefaultUriBuilderFactory("http://localhost:8080/"));
    }

    private ResponseEntity<Book> save(Book book) {
        return restTemplate.postForEntity("book", book, Book.class);
    }

    public void saveBooks() {

        for (int i=1; i<=10; i++){

            Book book = new Book();
            book.setName("Spring MVC " + i);
            book.setYear(2005 +i);
            book.setAuthor("Alex");
            save(book);
        }
    }
}
