package com.udemy.spring.spring_selenium.repository;

import com.udemy.spring.spring_selenium.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByFirstNameStartingWith(String startWith);
}
