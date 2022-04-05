package com.example.demo.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role")
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String roles;
    @ManyToOne
    @JoinColumn
    private Usr usr;
    public Role(Usr usr){
        this.usr = usr;
    }
}
