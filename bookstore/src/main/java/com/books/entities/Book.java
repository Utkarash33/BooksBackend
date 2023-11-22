package com.books.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	private Double page_count;
	private LocalDate published_date;
	
	
	 @ManyToMany(mappedBy = "books")
	    private List<Author> authors;
	
	
	@OneToMany(mappedBy = "book")
	@JsonIgnore
	private List<CommunityDiscussion> discussions;
	
	 @OneToMany(mappedBy = "book")
	 @JsonIgnore
	    private List<BookReview> reviews;

	    @OneToMany(mappedBy = "book")
	    @JsonIgnore
	    private List<ReadingList> readingLists;
	

}
