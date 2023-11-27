package com.books.services;

import java.util.List;

import com.books.entities.CommunityDiscussion;
import com.books.entities.DiscussionContent;

public interface DiscussionService {

	CommunityDiscussion createDiscussion( String title);

	List<CommunityDiscussion> getAllDiscussions();

	CommunityDiscussion findById(Integer discussionId);

	String deleteDiscussion(Integer discussionId);

	DiscussionContent addMessage(Integer discussionId, String content, Integer userId);

}
