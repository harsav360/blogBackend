package com.harsav360.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsav360.blog.entities.Category;
import com.harsav360.blog.entities.Post;
import com.harsav360.blog.entities.User;

public interface PostRepo extends JpaRepository<Post,Integer> {
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);

}
