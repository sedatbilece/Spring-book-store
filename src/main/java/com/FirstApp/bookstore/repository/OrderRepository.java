package com.FirstApp.bookstore.repository;

import com.FirstApp.bookstore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  OrderRepository extends JpaRepository<Order,Integer> {
}
