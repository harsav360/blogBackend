package com.harsav360.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harsav360.blog.payloads.ApiResponse;
import com.harsav360.blog.payloads.CategoryDto;
import com.harsav360.blog.services.CategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	// Create
	@PostMapping("/")
	public ResponseEntity<CategoryDto>createCategory(@Valid @RequestBody CategoryDto categoryDto)
	{
		CategoryDto createCategoryDto = this.categoryService.createCategory(categoryDto);
		return new ResponseEntity<>(createCategoryDto,HttpStatus.CREATED);
	}
	
	
	// Delete
	@DeleteMapping("/{categoryId}")
	public ResponseEntity<ApiResponse> deleteCategory(@PathVariable("categoryId") Integer catId)
	{
		this.categoryService.deleteCategory(catId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Category Deleted Successfully",true),HttpStatus.OK);
	}
	
	// Update
	@PutMapping("/{categoryId}")
	public ResponseEntity<CategoryDto>updateCategory(@Valid @RequestBody CategoryDto categoryDto,@PathVariable("categoryId") Integer catId)
	{
		CategoryDto updatedCategoryDto = this.categoryService.updateCategory(categoryDto, catId);
		return ResponseEntity.ok(updatedCategoryDto);
		
	}
	
	
	// Get All
	@GetMapping("/")
	public ResponseEntity<List<CategoryDto>>getCategories()
	{
		return ResponseEntity.ok(this.categoryService.getCategories());
	}
	
	
	// Get By Id
	@GetMapping("/{categoryId}")
	public ResponseEntity<CategoryDto>getSingleCategory(@PathVariable("categoryId") Integer catId)
	{
		return ResponseEntity.ok(this.categoryService.getCategory(catId));
	}
	

}
