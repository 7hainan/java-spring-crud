package com.devesteves.javaspringcrud.config;

import com.devesteves.javaspringcrud.entities.User;
import com.devesteves.javaspringcrud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null,"Thainan Esteves","thainan@gmail.com","999999999","123456");
        User user2 = new User(null,"Nathan Luciano","nathan@gmail.com","999999999","123456");

        userRepository.saveAll(Arrays.asList(user1,user2));
    }
}
