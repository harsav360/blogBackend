package com.harsav360.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harsav360.blog.payloads.ApiResponse;
import com.harsav360.blog.payloads.CommentDto;
import com.harsav360.blog.services.CommentService;

@RestController
@RequestMapping("/api")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@PostMapping("/post/{postId}/comments")
	public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto,@PathVariable("postId") Integer postId)
	{
		
		CommentDto createComment =  this.commentService.createComment(commentDto, postId);
		return new ResponseEntity<CommentDto>(createComment,HttpStatus.CREATED);
		
		
	}
	
	@DeleteMapping("/comments/{commentId}")
	public ApiResponse deleteComment(@PathVariable("commentId") Integer commentId)
	{
		
		this.commentService.deleteComment(commentId);
		return new ApiResponse("Comment is successfully deleted !!",true);
		
		
	}

}
