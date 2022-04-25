package com.example.demo.Repository;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query(
            value = "SELECT * FROM customer",
            nativeQuery = true)
    List<Customer> getall();
    Customer findById(long id);
}
