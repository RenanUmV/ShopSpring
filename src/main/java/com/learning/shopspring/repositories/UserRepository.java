package com.learning.shopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.shopspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
