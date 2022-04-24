package com.example.demo.Repository;

import com.example.demo.Entity.House;
import com.example.demo.Entity.buy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface buyRepository extends JpaRepository<buy, Long> {
    @Query(
            value = "SELECT * FROM buy",
            nativeQuery = true)
    List<buy> getall();
}
