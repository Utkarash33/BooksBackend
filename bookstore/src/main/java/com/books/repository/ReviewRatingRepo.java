package com.books.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.entities.Book;
import com.books.entities.BookReview;


public interface ReviewRatingRepo extends JpaRepository<BookReview, Integer>{

	
	List<BookReview> findByBook(Book book);
}
