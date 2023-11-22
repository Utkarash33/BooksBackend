package com.books.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "community_discussion")
public class CommunityDiscussion {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private LocalDate created_at;
	
	
	 @ManyToOne
	    private Book book;

	    @OneToMany(mappedBy = "discussion")
	    private List<DiscussionContent> contents;

}
