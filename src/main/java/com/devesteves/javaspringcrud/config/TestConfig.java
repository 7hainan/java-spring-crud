package com.devesteves.javaspringcrud.config;

import com.devesteves.javaspringcrud.entities.Category;
import com.devesteves.javaspringcrud.entities.Order;
import com.devesteves.javaspringcrud.entities.User;
import com.devesteves.javaspringcrud.entities.enums.OrderStatus;
import com.devesteves.javaspringcrud.repositories.CategoryRepository;
import com.devesteves.javaspringcrud.repositories.OrderRepository;
import com.devesteves.javaspringcrud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");
        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));

        User user1 = new User(null,"Fulado de Tal","fulano@gmail.com","999999999","123456");
        User user2 = new User(null,"Ciclano da Onde","ciclano@gmail.com","999999999","123456");
        userRepository.saveAll(Arrays.asList(user1,user2));

        Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, user1);
        Order order2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.CANCELED, user2);
        Order order3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED,user1);
        orderRepository.saveAll(Arrays.asList(order1,order2,order3));
    }
}
