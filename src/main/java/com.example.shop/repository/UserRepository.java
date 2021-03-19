package com.example.shop.repository;

import com.example.shop.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByLastName(String lastName);
    List<User> findByFirstName(String firstName);
    User findByUserName(String userName);
    User findById(long id);
}
