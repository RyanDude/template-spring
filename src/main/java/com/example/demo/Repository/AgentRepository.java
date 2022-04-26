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

    @Query(
            value = "select T.BNO, T.BName, T.NumOfSale, T2.NumOfPurchase from (select B.id as BNO, B.name as BName, Count(*) NumOfSale from office B, agent A, customer C, sell S " +
                    "Where B.id=A.branch_office_id and A.id=C.id and C.id=S.id " +
                    "group by BNO) T, " +
                    "(Select B.id as BNO, B.name as BName, Count(*) NumOfPurchase " +
                    "From office B, agent A, customer C, buy " +
                    "Where B.id= A.branch_office_id and A.id = C.id and C.id = buy.id " +
                    "Group by BNO) T2 " +
                    "where T.BNO=T2.BNO " +
                    "order by BNO;",
            nativeQuery = true)
    List<Object[]> for_eight();


}
