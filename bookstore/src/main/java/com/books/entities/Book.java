package com.books.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
public class Book {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String google_books_api_id;
	
	private String title;
	private String description;
	private Integer page_count;
	private String published_date;
	private String image;
	
	 @ManyToMany(mappedBy = "books")
	    private List<Author> authors;
	
	
	
	   @OneToMany(mappedBy = "book",cascade = CascadeType.ALL)
	    private List<BookReview> reviews;

	     @OneToMany(mappedBy = "book",cascade = CascadeType.ALL)
	    private List<ReadingList> readingLists;
	

}
