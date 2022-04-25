package com.example.demo.Repository;

import com.example.demo.Entity.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PartnerRepository extends JpaRepository<Partner, Long> {
    Partner findById(long id);
    @Query(
            value = "SELECT * FROM partner p where p.expertise= :expertise ",
            nativeQuery = true)
    List<Partner> findByExpertise(@Param("expertise") String expertise);
}
