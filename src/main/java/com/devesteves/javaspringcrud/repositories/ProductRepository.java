package com.devesteves.javaspringcrud.repositories;

import com.devesteves.javaspringcrud.entities.Category;
import com.devesteves.javaspringcrud.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
