package com.devesteves.javaspringcrud.repositories;

import com.devesteves.javaspringcrud.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
