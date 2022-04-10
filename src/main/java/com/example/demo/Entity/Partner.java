package com.example.demo.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    @ManyToOne
    @JoinColumn
    private Agent agent;
    public Partner(Agent agent, PartnerTeams partnerTeams){
        this.agent = agent;
        this.partnerTeams = partnerTeams;
    }
    @ManyToOne
    @JoinColumn
    private PartnerTeams partnerTeams;

}
