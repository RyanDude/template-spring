package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "partner")
@Data
@NoArgsConstructor
public class Partner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Name;
    private String Expertise;
    private String Phone;
    private String YrExp;
    @OneToMany(mappedBy = "partner")
    @JsonIgnore
    private List<Corporate> corporate = new ArrayList<>();
    public Partner(PartnerTeams partnerTeams){
        this.partnerTeams = partnerTeams;
    }
    @ManyToOne
    @JoinColumn
    private PartnerTeams partnerTeams;

}
