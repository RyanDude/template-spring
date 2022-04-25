package com.example.demo.Repository;

import com.example.demo.Entity.Corporate;
import com.example.demo.Entity.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CorporateRepository extends JpaRepository<Corporate, Long> {
    @Query(
            value = "SELECT * FROM corporate",
            nativeQuery = true)
    List<Corporate> getall();
    Corporate findById(long id);
    List<Corporate> findByAgent_id(long id);
}
