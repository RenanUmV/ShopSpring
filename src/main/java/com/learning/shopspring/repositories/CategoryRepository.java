package com.learning.shopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.shopspring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
