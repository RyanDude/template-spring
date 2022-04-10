package com.example.demo.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String stage;
    private int rating;
    @ManyToOne
    @JoinColumn
    private SchoolDistrict schoolDistrict;
    public School(SchoolDistrict district){
        schoolDistrict = district;
    }
}
