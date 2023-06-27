package com.devesteves.javaspringcrud.services;

import com.devesteves.javaspringcrud.entities.User;
import com.devesteves.javaspringcrud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> optUser = userRepository.findById(id);
        return optUser.orElse(null);
    }
}
