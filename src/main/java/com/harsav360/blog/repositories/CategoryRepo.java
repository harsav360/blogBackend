package com.harsav360.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsav360.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
