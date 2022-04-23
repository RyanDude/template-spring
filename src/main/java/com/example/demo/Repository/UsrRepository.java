package com.example.demo.Repository;

import com.example.demo.Entity.Usr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsrRepository extends JpaRepository<Usr, Long> {
    public Usr findByUsername(String username);
    Usr findById(long id);
}
