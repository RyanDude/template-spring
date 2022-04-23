package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String elementary;
    private int e_rating;
    private String middle_school;
    private int m_rating;
    private String high_school;
    private int h_rating;
    @OneToMany(mappedBy = "school")
    @JsonIgnore
    private List<Community> communities = new ArrayList<>();
}
