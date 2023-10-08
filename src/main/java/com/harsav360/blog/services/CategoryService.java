package com.harsav360.blog.services;

import java.util.List;

import com.harsav360.blog.payloads.CategoryDto;

public interface CategoryService {

	// Create 
	
	CategoryDto createCategory(CategoryDto categoryDto);
	
	// Update 
	CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
	// Delete By Id
	void deleteCategory(Integer categoryId);
	
	// Get By id
	CategoryDto getCategory(Integer categoryId);
	
	// Get All
	List<CategoryDto> getCategories();
}
