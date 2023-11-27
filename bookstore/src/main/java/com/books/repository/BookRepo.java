package com.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.entities.Book;
import java.util.List;


public interface BookRepo extends JpaRepository<Book, Integer>{
	
       List<Book> findByGoogle_books_api_id(String google_books_api_id);

}
