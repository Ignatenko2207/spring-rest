package it.discovery.repository;

import it.discovery.model.Book;
import it.discovery.pagination.Page;
import it.discovery.pagination.PageCriteria;

import java.util.List;

public interface BookRepository {
	Book findById(int id);
	
	List<Book> findAll();

	Page searchBooks(PageCriteria pageCriteria);

	void save(Book book);
	
	boolean delete(int id);

	boolean isEmpty();

}
