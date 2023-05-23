package com.tecnocoli.course_1b.services;

import com.tecnocoli.course_1b.entities.User;
import com.tecnocoli.course_1b.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findByID(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}
