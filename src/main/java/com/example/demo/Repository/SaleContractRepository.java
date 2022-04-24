package com.example.demo.Repository;

import com.example.demo.Entity.SaleContract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleContractRepository extends JpaRepository<SaleContract, Long> {
    SaleContract findById(long id);
}
