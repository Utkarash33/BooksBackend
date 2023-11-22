package com.books.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String username;
	private String password;
	private String role;
	
	
	  @OneToMany(mappedBy = "user")
	    private List<DiscussionContent> discussionContents;

	    @OneToMany(mappedBy = "user")
	    private List<BookReview> bookReviews;

	    @OneToMany(mappedBy = "user")
	    private List<ReadingList> readingLists;

}
