package com.example.demo.Repository;

import com.example.demo.Entity.House;
import com.example.demo.Entity.sell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SellRepository extends JpaRepository<sell, Long> {
    @Query(
            value = "SELECT * FROM sell",
            nativeQuery = true)
    List<sell> getall();
    sell findById(long id);
}
