package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "usr")

public class Usr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
}
