package com.tecnocoli.course_1b.repositories;

import com.tecnocoli.course_1b.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
