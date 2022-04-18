package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "saleContract")
@Data
@NoArgsConstructor
public class SaleContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private double price;
    private String mortgage_company;
    private String financial_professionals;
    private Date close_data;
    @OneToMany(mappedBy = "saleContract", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<sell> sells = new ArrayList<>();
}
