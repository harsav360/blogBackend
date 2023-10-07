package com.harsav360.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsav360.blog.entities.User;

public interface UserRepo extends JpaRepository<User,Integer> {

	
}
