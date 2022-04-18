package com.example.demo.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "corporate")
@Data
@NoArgsConstructor
public class Corporate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn
    private Agent agent;
    @ManyToOne
    @JoinColumn
    private Partner partner;
    public Corporate(Agent agent, Partner partner){
        this.agent = agent;
        this.partner = partner;
    }
}
