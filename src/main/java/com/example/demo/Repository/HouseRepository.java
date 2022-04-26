package com.example.demo.Repository;

import com.example.demo.Entity.Agent;
import com.example.demo.Entity.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
    @Query(
            value = "Select H.id, C.name, C.hoafee From house H, community C Where H.community_id= C.id and C.facility like %:facility%",
            nativeQuery = true)
    List<Object[]> get_for_ten(@Param("facility") String facility);
    @Query(
            value = "Select H.id, H.list_price, SA.sold_price From house H, sell SE, sale_contract SA " +
                    "Where H.id= SE.house_id and SE.sale_contract_id = SA.id " +
                    "Union " +
                    "Select H.id, H.list_price, P.price " +
                    "From house H, buy B, purchase_contract P " +
                    "Where H.id = B.house_id and B.purchase_contract_id= P.id",
            nativeQuery = true)
    List<Object[]> get_for_five();
}
