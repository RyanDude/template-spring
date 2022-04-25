package com.example.demo.Repository;

import com.example.demo.Entity.BranchOffice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfficeRepository extends JpaRepository<BranchOffice, Long> {
    BranchOffice findById(long id);
}
