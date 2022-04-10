package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "house")
@Data
@NoArgsConstructor
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Address;
    private String type;
    private double ListPrice;
    private String offers;
    private int NumOfBed;
    private int NumOfBath;
    private double tax;
    @OneToMany(mappedBy = "house", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Contract> contracts = new ArrayList<>();
    @ManyToOne
    @JoinColumn
    private Community community;
    @ManyToOne
    @JoinColumn
    private Seller seller;
    public House(Community community, Seller seller){
        this.community = community;
        this.seller = seller;
    }
}
