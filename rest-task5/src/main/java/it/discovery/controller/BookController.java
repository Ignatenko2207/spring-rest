package it.discovery.controller;

import it.discovery.model.Book;
import it.discovery.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {	

    @Autowired
    BookRepository bookRepository;

    @GetMapping(path = "/{id}", produces={MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE})
//    @GetMapping(path = "/{id}")
    public Book getBookById(@PathVariable int id){
//        return bookRepository.findById(id);
        return new Book(1, "Me", "Good life", 2019);
    }

}
