package com.devesteves.javaspringcrud.repositories;

import com.devesteves.javaspringcrud.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
