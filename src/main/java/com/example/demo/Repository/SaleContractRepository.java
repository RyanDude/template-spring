package com.example.demo.Repository;

import com.example.demo.Entity.SaleContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleContractRepository extends JpaRepository<SaleContract, Long> {
    SaleContract findById(long id);
    @Query(
            value = "Select payment_method, count(*) From sale_contract group by payment_method",
            nativeQuery = true)
    List<Object[]> getPayMethod();
}
