package com.harsav360.blog.services;

import java.util.List;

import com.harsav360.blog.payloads.PostDto;

public interface PostService {
	
	// Create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	// Update
	PostDto updatePost(PostDto postDto,Integer postId);
	
	// Delete
	void deletePost(Integer postId);
	
	// Get All Posts
	List<PostDto> getAllPost();
	
	// Get Post By ID
	PostDto getPostById(Integer postId);
	
	// Get All Post by Category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	// Get All Post by User
	List<PostDto> getPostsByUser(Integer userId);
	
	// Search Post
	List<PostDto> searchPosts(String keyword);

}
