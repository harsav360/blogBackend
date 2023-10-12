package com.harsav360.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsav360.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment,Integer> {
	

}
