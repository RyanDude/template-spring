package com.example.demo.Repository;

import com.example.demo.Entity.Agent;
import com.example.demo.Entity.BranchOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AgentRepository extends JpaRepository<Agent, Long> {
    List<Agent> findByName(String name);
    @Query(
            value = "SELECT * FROM agent",
            nativeQuery = true)
    List<Agent> getall();
    Agent findById(long id);
    @Query(
            value = "SELECT a.id FROM agent a where a.branch_office_id= :id ",
            nativeQuery = true)
    List<Integer> findByBranchOfficeId(@Param("id")int id);

}
