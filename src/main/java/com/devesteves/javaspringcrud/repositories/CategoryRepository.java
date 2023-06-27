package com.devesteves.javaspringcrud.repositories;

import com.devesteves.javaspringcrud.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
