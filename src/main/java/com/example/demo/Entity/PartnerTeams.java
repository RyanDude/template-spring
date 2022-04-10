package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "partnerTeams")
@Data
public class PartnerTeams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String type;
    private int NumberOfWorkers;
    private String location;
    @OneToMany(mappedBy = "partnerTeams", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Partner> partner = new ArrayList<>();
}
