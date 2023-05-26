package com.tecnocoli.course_1b.repositories;

import com.tecnocoli.course_1b.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
