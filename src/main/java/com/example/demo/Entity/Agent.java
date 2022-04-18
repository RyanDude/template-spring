package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "agent")
@NoArgsConstructor
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String gender;
    private String BirthDate;
    private String address;
    private int YrExp;
    private String TransRecord;
    @ManyToOne
    @JoinColumn
    private BranchOffice branchOffice;
    public Agent(BranchOffice branchOffice){
        this.branchOffice = branchOffice;
    }
    @OneToMany(mappedBy = "agent", cascade = CascadeType.ALL)
    @JsonIgnore
    List<Corporate> corporates = new ArrayList<>();
    @OneToMany(mappedBy = "agent", cascade = CascadeType.ALL)
    @JsonIgnore
    List<Customer> customers = new ArrayList<>();

}
