package com.example.demo.Repository;

import com.example.demo.Entity.Agent;
import com.example.demo.Entity.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HouseRepository extends JpaRepository<House, Long> {
    @Query(
            value = "SELECT * FROM house",
            nativeQuery = true)
    List<House> getall();
    House findById(long id);
    List<House> findByCounty(String county);
    @Query(
            value = "Select type, MAX(offers), MIN(offers) From house Where status ='Closed' Group by type",
            nativeQuery = true)
    List<Object[]> get_for_nine();
}
