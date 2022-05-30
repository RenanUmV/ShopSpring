package com.learning.shopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.shopspring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
