package com.tecnocoli.course_1b.repositories;

import com.tecnocoli.course_1b.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
