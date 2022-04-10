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
    @ManyToOne
    @JoinColumn
    private BranchOffice branchOffice;
    public Agent(BranchOffice branchOffice){
        this.branchOffice = branchOffice;
    }
    @OneToMany(mappedBy = "agent", cascade = CascadeType.ALL)
    @JsonIgnore
    List<Partner> partners = new ArrayList<>();


}
