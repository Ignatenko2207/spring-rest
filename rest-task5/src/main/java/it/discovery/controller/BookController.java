package it.discovery.controller;

import it.discovery.model.Book;
import it.discovery.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {	

    @Autowired
    BookRepository bookRepository;

    @GetMapping(produces={MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @GetMapping(path = "/{id}", produces={MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Book getBookById(@PathVariable("id") int id){
        return bookRepository.findById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Book createBook(@RequestBody Book book){
        bookRepository.save(book);
        return book;
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Book updateBook(@RequestBody Book book){
        if(bookRepository.findById(book.getId())!=null){
            bookRepository.save(book);
            return bookRepository.findById(book.getId());
        }
        return book;
    }

    @DeleteMapping(path = "/{id}")
    public void deleteBook(@PathVariable("id") int id){
        bookRepository.delete(id);
    }
}
