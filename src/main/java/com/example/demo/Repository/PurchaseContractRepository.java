package com.example.demo.Repository;

import com.example.demo.Entity.PurchaseContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PurchaseContractRepository extends JpaRepository<PurchaseContract, Long> {
    @Query(
            value = "SELECT mortgage_company,count(*) FROM purchase_contract group by mortgage_company",
            nativeQuery = true)
    List<Object[]> getMortgage();
}
