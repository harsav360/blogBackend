package com.harsav360.blog.services;

import java.util.List;

import com.harsav360.blog.entities.Post;
import com.harsav360.blog.payloads.PostDto;

public interface PostService {
	
	// Create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	// Update
	PostDto updatePost(PostDto postDto,Integer postId);
	
	// Delete
	void deletePost(Integer postId);
	
	// Get All Posts
	List<Post> getAllPost();
	
	// Get Post By ID
	PostDto getPostById(Integer postId);
	
	// Get All Post by Category
	List<Post> getPostsByCategory(Integer categoryId);
	
	// Get All Post by User
	List<Post> getPostsByUser(Integer userId);
	
	// Search Post
	List<Post> searchPosts(String keyword);

}
