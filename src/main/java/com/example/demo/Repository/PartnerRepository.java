package com.example.demo.Repository;

import com.example.demo.Entity.Partner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartnerRepository extends JpaRepository<Partner, Long> {
    Partner findById(long id);
}
