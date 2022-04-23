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
    private String county;
    private String type;
    private double ListPrice;
    private String status;
    private int offers;
    private int sqft;
    private int NumOfBed;
    private int NumOfBath;
    private double tax;
    @OneToMany(mappedBy = "house", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<sell> sells = new ArrayList<>();
    @OneToMany(mappedBy = "house", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<buy> buys = new ArrayList<>();
    @ManyToOne
    @JoinColumn
    private Community community;

    public House(Community community){
        this.community = community;
    }
}
