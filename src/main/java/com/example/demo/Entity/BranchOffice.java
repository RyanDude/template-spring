package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Office")
@Data
public class BranchOffice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;
    private String manager;
    private String phone;
    private String RespArea;
    @OneToMany(mappedBy = "branchOffice", cascade = CascadeType.ALL)
    @JsonIgnore
    List<Agent> agents = new ArrayList<>();

}
