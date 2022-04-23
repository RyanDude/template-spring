package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "community")
@Data
@NoArgsConstructor
public class Community {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double HOAfee;
    private String Facility;
    @OneToMany(mappedBy = "community", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<House> houses = new ArrayList<>();
    @ManyToOne
    @JoinColumn
    private School school;
    public Community(School school){
        this.school = school;
    }

}
