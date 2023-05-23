package com.tecnocoli.course_1b.repositories;

import com.tecnocoli.course_1b.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
