package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "schoolDistrict")
@Data
public class SchoolDistrict {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int AvgRating;
    @OneToMany(mappedBy = "schoolDistrict",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Community> communities = new ArrayList<>();
    @OneToMany(mappedBy = "schoolDistrict", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<School> schools = new ArrayList<>();

}
