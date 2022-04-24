package com.example.demo.Repository;

import com.example.demo.Entity.Community;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunityRepository extends JpaRepository<Community, Long> {
    Community findById(long id);
}
